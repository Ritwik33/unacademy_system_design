package lld.designPatterns.structuralDesignPattern.decoratorDesignPattern;

public class CarDecorator implements Car {

    public Car car;

    public CarDecorator(Car car) {
        this.car = car;
    }

    @Override
    public void manufactureCar() {
        car.manufactureCar();
    }
}
