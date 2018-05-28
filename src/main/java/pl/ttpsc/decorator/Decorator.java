package pl.ttpsc.decorator;

public abstract class Decorator extends Car{
    private final Car car;

    public Decorator(Car car) {
        this.car = car;
    }

    @Override
    public double getWeight() {
        return getDecoratorWeight() + car.getWeight();
    }

    protected abstract double getDecoratorWeight();
}
