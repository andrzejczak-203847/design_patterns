package pl.ttpsc.observer;

public class TvpInfo implements Observer {
    @Override
    public void update(String news) {
        System.out.println("TVP INFO: " + news);
    }
}