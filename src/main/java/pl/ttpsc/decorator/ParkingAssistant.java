package pl.ttpsc.decorator;

public class ParkingAssistant extends Decorator {
    public ParkingAssistant(Car car) {
        super(car);
    }

    @Override
    protected double getDecoratorWeight() {
        return 20;
    }
}
