package lld.designPatterns.creationalDesignPattern.factoryDesignPattern;

public class SportsCar implements Car{

    private String steeringWheel;
    private String brakes;
    private String mirrors;

    public SportsCar(String steeringWheel, String brakes, String mirrors) {
        this.steeringWheel = steeringWheel;
        this.brakes = brakes;
        this.mirrors = mirrors;
        System.out.println("Creating a sports car");
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
        return "SportsCarDecorator{" +
                "steeringWheel='" + steeringWheel + '\'' +
                ", brakes='" + brakes + '\'' +
                ", mirrors='" + mirrors + '\'' +
                '}';
    }
}
