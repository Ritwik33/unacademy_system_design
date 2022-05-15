package lld.designPatterns.creationalDesignPattern.abstractFactoryDesignPattern;

public class SportsCarFactory implements CarAbstractFactory{

    private String steeringWheel;
    private String brakes;
    private String mirros;

    public SportsCarFactory(String steeringWheel, String brakes, String mirros) {
        this.steeringWheel = steeringWheel;
        this.brakes = brakes;
        this.mirros = mirros;
    }

    @Override
    public Car createCar() {
        return new SportsCar(steeringWheel, brakes, mirros);
    }
}
