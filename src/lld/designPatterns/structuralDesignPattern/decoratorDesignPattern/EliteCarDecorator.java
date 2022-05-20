package lld.designPatterns.structuralDesignPattern.decoratorDesignPattern;

public class EliteCarDecorator extends CarDecorator {

    public EliteCarDecorator(Car car) {
        super(car);
    }

    public void manufactureCar() {
        super.manufactureCar();
        System.out.println("Adding Elite car features...");
    }
}
