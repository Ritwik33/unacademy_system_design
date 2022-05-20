package lld.designPatterns.structuralDesignPattern.decoratorDesignPattern;

public class BaseCar implements Car {
    @Override
    public void manufactureCar() {
        System.out.println("manufacturing basic car...");
    }
}
