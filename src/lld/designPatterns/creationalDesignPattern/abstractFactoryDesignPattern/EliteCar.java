package lld.designPatterns.creationalDesignPattern.abstractFactoryDesignPattern;

public class EliteCar implements Car {

    private String steeringWheel;
    private String brakes;
    private String mirrors;

    public EliteCar(String steeringWheel, String brakes, String mirrors) {
        this.steeringWheel = steeringWheel;
        this.brakes = brakes;
        this.mirrors = mirrors;
        System.out.println("creating an elite car");
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
        return "EliteCar{" +
                "steeringWheel='" + steeringWheel + '\'' +
                ", brakes='" + brakes + '\'' +
                ", mirrors='" + mirrors + '\'' +
                '}';
    }
}
