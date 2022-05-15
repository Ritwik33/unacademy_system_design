package lld.designPatterns.creationalDesignPattern.builderDesignPattern;

public class Car {

    /**
     * compulsory attributes
     */

    private String steeringWheel;
    private String brakes;
    private String mirrors;

    /**
     * optional attributes
     */

    private String seatCover;
    private String ac;
    private String musicSystem;

    public Car(CarBuilder carBuilder) {
        steeringWheel = carBuilder.steeringWheel;
        brakes = carBuilder.brakes;
        mirrors = carBuilder.mirrors;
        seatCover = carBuilder.seatCover;
        ac = carBuilder.ac;
        musicSystem = carBuilder.musicSystem;
    }

    @Override
    public String toString() {
        return "Car{" +
                "steeringWheel='" + steeringWheel + '\'' +
                ", brakes='" + brakes + '\'' +
                ", mirrors='" + mirrors + '\'' +
                ", seatCover='" + seatCover + '\'' +
                ", ac='" + ac + '\'' +
                ", musicSystem='" + musicSystem + '\'' +
                '}';
    }

    public static class CarBuilder {

        /**
         * compulsory
         */

        private String steeringWheel;
        private String brakes;
        private String mirrors;

        /**
         * optinal
         */

        private String seatCover;
        private String ac;
        private String musicSystem;

        public CarBuilder(String steeringWheel, String brakes, String mirrors) {
            this.steeringWheel = steeringWheel;
            this.brakes = brakes;
            this.mirrors = mirrors;
        }

        public CarBuilder setSeatCover(String seatCover) {
            this.seatCover = seatCover;
            return this;
        }

        public CarBuilder setAc(String ac) {
            this.ac = ac;
            return this;
        }

        public CarBuilder setMusicSystem(String musicSystem) {
            this.musicSystem = musicSystem;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }
}
