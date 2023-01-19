package pattern.creational.builder;

import java.util.StringJoiner;

public class RoadBike extends Bike {

    private String transmission;

    private RoadBike(String frame, String wheels, String handlebar, String saddle, String brake,
                     String transmission) {
        this.frame = frame;
        this.wheels = wheels;
        this.handlebar = handlebar;
        this.saddle = saddle;
        this.brake = brake;
        this.transmission = transmission;
    }

    public String getTransmission() {
        return transmission;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", RoadBike.class.getSimpleName() + "[", "]")
                .add(super.toString())
                .add("transmission='" + transmission + "'")
                .toString();
    }

    public static RoadBikeBuilder builder() {
        return new RoadBikeBuilder();
    }

    public static class RoadBikeBuilder extends AbstractBikeBuilder<RoadBike> {

        private String transmission;

        @Override
        public IBikeBuilder<RoadBike> withTransmission(String transmission) {
            this.transmission = transmission;
            return this;
        }

        @Override
        public RoadBike build() {
            return new RoadBike(frame, wheels, handlebar, saddle, brake, transmission);
        }

    }

}
