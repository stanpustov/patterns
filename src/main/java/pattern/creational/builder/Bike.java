package pattern.creational.builder;

import java.util.StringJoiner;

public abstract class Bike {

    protected String frame;
    protected String wheels;
    protected String handlebar;
    protected String saddle;
    protected String brake;

    public String getFrame() {
        return frame;
    }

    public String getWheels() {
        return wheels;
    }

    public String getHandlebar() {
        return handlebar;
    }

    public String getSaddle() {
        return saddle;
    }

    public String getBrake() {
        return brake;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Bike.class.getSimpleName() + "[", "]")
                .add("frame='" + frame + "'")
                .add("wheels='" + wheels + "'")
                .add("handlebar='" + handlebar + "'")
                .add("saddle='" + saddle + "'")
                .add("brake='" + brake + "'")
                .toString();
    }
}
