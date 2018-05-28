package pl.ttpsc;

import pl.ttpsc.decorator.*;
import pl.ttpsc.observer.PolsatNews;
import pl.ttpsc.observer.PolskaAgencjaPrasowa;
import pl.ttpsc.observer.Tvn24;
import pl.ttpsc.observer.TvpInfo;

public class App {

    public static void main(String args[]) {
        // Observer
        PolskaAgencjaPrasowa pap = new PolskaAgencjaPrasowa();
        pap.addObserver(new PolsatNews());
        pap.addObserver(new Tvn24());
        pap.addObserver(new TvpInfo());
        pap.updateAll("HELLO WORLD!");

        // Decorator
        Car car = new Sedan();
        Decorator transmission = new AutomaticTransmission(car);
        Decorator assistant = new ParkingAssistant(transmission);
        System.out.println(assistant.getWeight());
    }
}
