package lld.designPatterns.structuralDesignPattern.decoratorDesignPattern;

public class CarManufacturingUnit {
    public static void main(String[] args) {

        Car sportsCar = new SportsCarDecorator(new BaseCar());
        sportsCar.manufactureCar();

        Car sportsElectricCar = new SportsCarDecorator(new ElectricCarDecorator(new BaseCar()));
        sportsElectricCar.manufactureCar();

        Car superCar = new SportsCarDecorator(new ElectricCarDecorator(new EliteCarDecorator(new BaseCar())));
        superCar.manufactureCar();
    }
}
