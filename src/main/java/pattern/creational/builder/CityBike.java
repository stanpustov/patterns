package pattern.creational.builder;

import java.util.StringJoiner;

public class CityBike extends Bike {

    private String fender;
    private String rack;

    private CityBike(String frame, String wheels, String handlebar, String saddle, String brake,
                    String fender, String rack) {
        this.frame = frame;
        this.wheels = wheels;
        this.handlebar = handlebar;
        this.saddle = saddle;
        this.brake = brake;
        this.fender = fender;
        this.rack = rack;
    }

    public String getFender() {
        return fender;
    }

    public String getRack() {
        return rack;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", CityBike.class.getSimpleName() + "[", "]")
                .add(super.toString())
                .add("fender='" + fender + "'")
                .add("rack='" + rack + "'")
                .toString();
    }

    public static CityBikeBuilder builder() {
        return new CityBikeBuilder();
    }

    public static class CityBikeBuilder extends AbstractBikeBuilder<CityBike> {

        private String fender;
        private String rack;

        @Override
        public IBikeBuilder<CityBike> withFender(String fender) {
            this.fender = fender;
            return this;
        }

        @Override
        public IBikeBuilder<CityBike> withRack(String rack) {
            this.rack = rack;
            return this;
        }

        @Override
        public CityBike build() {
            return new CityBike(frame, wheels, handlebar, saddle, brake, fender, rack);
        }
    }

}
