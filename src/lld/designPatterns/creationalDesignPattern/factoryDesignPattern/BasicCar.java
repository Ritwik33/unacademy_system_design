package lld.designPatterns.creationalDesignPattern.factoryDesignPattern;

public class BasicCar implements Car {

    private String steeringWheel;
    private String brakes;
    private String mirrors;

    public BasicCar(String steeringWheel, String brakes, String mirrors) {
        this.steeringWheel = steeringWheel;
        this.brakes = brakes;
        this.mirrors = mirrors;
        System.out.println("creating a basic car");
    }

    @Override
    public String getSteeringWheel() {
        return steeringWheel;
    }

    @Override
    public String getBrakes() {
        return brakes;
    }

    @Override
    public String getMirrors() {
        return mirrors;
    }

    @Override
    public String toString() {
        return "BasicCar{" +
                "steeringWheel='" + steeringWheel + '\'' +
                ", brakes='" + brakes + '\'' +
                ", mirrors='" + mirrors + '\'' +
                '}';
    }
}
