package pl.ttpsc.observer;

import java.util.ArrayList;
import java.util.List;

public class PolskaAgencjaPrasowa {
    private List<Observer> observerList = new ArrayList<>();

    public void addObserver(Observer observer) {
        observerList.add(observer);
    }

    public void updateAll(String news) {
        for (Observer observer : observerList) {
            observer.update(news);
        }
    }
}
