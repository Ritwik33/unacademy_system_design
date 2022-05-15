package lld.designPatterns.creationalDesignPattern.factoryDesignPattern;

public class Test {
    public static void main(String[] args) {
        Car car = CarFactory.createCar("SW", "B", "M", "BASIC");
        System.out.println(car.toString());
    }
}
