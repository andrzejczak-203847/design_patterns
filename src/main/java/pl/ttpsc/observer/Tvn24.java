package pl.ttpsc.observer;

public class Tvn24 implements Observer {
    @Override
    public void update(String news) {
        System.out.println("TVN24: " + news);
    }
}