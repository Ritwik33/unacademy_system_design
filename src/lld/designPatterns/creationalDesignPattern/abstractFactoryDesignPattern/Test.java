package lld.designPatterns.creationalDesignPattern.abstractFactoryDesignPattern;

public class Test {
    public static void main(String[] args) {
        Car car = CarFactory.getCar(new EliteCarFactory("SW", "B", "M"));
    }
}
