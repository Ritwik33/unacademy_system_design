package lld.designPatterns.creationalDesignPattern.abstractFactoryDesignPattern;

public class EliteCarFactory implements CarAbstractFactory {

    private String steeringWheel;
    private String brakes;
    private String mirrors;

    public EliteCarFactory(String steeringWheel, String brakes, String mirrors) {
        this.steeringWheel = steeringWheel;
        this.brakes = brakes;
        this.mirrors = mirrors;
    }

    @Override
    public Car createCar() {
        return new EliteCar(steeringWheel, brakes, mirrors);
    }
}
