package lld.designPatterns.creationalDesignPattern.abstractFactoryDesignPattern;

public class CarFactory {
    public static Car getCar(CarAbstractFactory carAbstractFactory) {
        return carAbstractFactory.createCar();
    }
}
