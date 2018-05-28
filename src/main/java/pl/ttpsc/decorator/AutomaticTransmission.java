package pl.ttpsc.decorator;

public class AutomaticTransmission extends Decorator {
    public AutomaticTransmission(Car car) {
        super(car);
    }

    @Override
    protected double getDecoratorWeight() {
        return 40;
    }
}
