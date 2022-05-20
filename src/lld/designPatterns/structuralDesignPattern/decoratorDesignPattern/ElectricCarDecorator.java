package lld.designPatterns.structuralDesignPattern.decoratorDesignPattern;

public class ElectricCarDecorator extends CarDecorator {

    public ElectricCarDecorator(Car car) {
        super(car);
    }

    public void manufactureCar() {
        super.manufactureCar();
        System.out.println("Adding electric car features...");
    }
}
