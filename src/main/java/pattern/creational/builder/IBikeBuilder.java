package pattern.creational.builder;

public interface IBikeBuilder<T extends Bike> {

    default IBikeBuilder<T> withFrame(String frame) {
        return null;
    }

    default IBikeBuilder<T> withWheels(String wheels) {
        return null;
    }

    default IBikeBuilder<T> withHandlebar(String handlebar) {
        return null;
    }

    default IBikeBuilder<T> withSaddle(String saddle) {
        return null;
    }

    default IBikeBuilder<T> withBrake(String brake) {
        return null;
    }

    default IBikeBuilder<T> withTransmission(String transmission) {
        return null;
    }

    default IBikeBuilder<T> withFender(String fender) {
        return null;
    }

    default IBikeBuilder<T> withRack(String rack) {
        return null;
    }

    T build();

}
