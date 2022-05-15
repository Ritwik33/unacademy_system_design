package lld.designPatterns.creationalDesignPattern.factoryDesignPattern;

public class CarFactory {
    public static Car createCar(String steeringWheel, String brakes, String mirrors, String typeOfCar) {
        if(typeOfCar.equals("BASIC")) {
            return new BasicCar(steeringWheel, brakes, mirrors);
        } else if(typeOfCar.equals("SPORTS")) {
            return new SportsCar(steeringWheel, brakes, mirrors);
        } else {
            throw new RuntimeException("This type is currently not available");
        }
    }
}
