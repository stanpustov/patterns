package pattern.creational.builder;

abstract public class AbstractBikeBuilder<T extends Bike> implements IBikeBuilder<T> {

    protected String frame;
    protected String wheels;
    protected String handlebar;
    protected String saddle;
    protected String brake;

    @Override
    public IBikeBuilder<T> withFrame(String frame) {
        this.frame = frame;
        return this;
    }

    @Override
    public IBikeBuilder<T> withWheels(String wheels) {
        this.wheels = wheels;
        return this;
    }

    @Override
    public IBikeBuilder<T> withHandlebar(String handlebar) {
        this.handlebar = handlebar;
        return this;
    }

    @Override
    public IBikeBuilder<T> withSaddle(String saddle) {
        this.saddle = saddle;
        return this;
    }

    @Override
    public IBikeBuilder<T> withBrake(String brake) {
        this.brake = brake;
        return this;
    }
}
