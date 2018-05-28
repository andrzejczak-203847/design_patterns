package pl.ttpsc.observer;

public class PolsatNews implements Observer {

    @Override
    public void update(String news) {
        System.out.println("POLSAT NEWS: " + news);
    }
}