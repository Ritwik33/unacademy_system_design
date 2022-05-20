package lld.designPatterns.structuralDesignPattern.decoratorDesignPattern;

public class SportsCarDecorator extends CarDecorator {

    public SportsCarDecorator(Car car) {
        super(car);
    }

    public void manufactureCar() {
        super.manufactureCar();
        System.out.println("Adding sports car features...");
    }
}
