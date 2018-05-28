package pl.ttpsc.singleton;

import org.junit.Assert;
import org.junit.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

public class SingletonTest {
    Singleton a;
    Singleton b;

    @Test
    public void shouldReturnOneInstance() throws InterruptedException {
        int success = 0, failure = 0;
        for (int i = 0; i < 1000; i++) {
            Singleton.instance = null;
            ExecutorService service = Executors.newFixedThreadPool(2);
            service.submit(() -> a = Singleton.getInstance());
            service.submit(() -> b = Singleton.getInstance());
            service.shutdown();
            service.awaitTermination(1, TimeUnit.SECONDS);
            if (a == b) {
                success++;
            } else {
                failure++;
            }
        }
        Assert.assertEquals(1000, success);
        Assert.assertEquals(0, failure);
    }
}