package lld.designPatterns.creationalDesignPattern.builderDesignPattern;

public class Test {
    public static void main(String[] args) {
        Car car = new Car.CarBuilder("SW", "B", "M").build();
        System.out.println(car.toString());

        Car car2 = new Car.CarBuilder("SW", "B", "M").setSeatCover("SW").setAc("AC").build();
        System.out.println(car2.toString());
    }
}
