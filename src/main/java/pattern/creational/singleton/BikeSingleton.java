package pattern.creational.singleton;

import java.util.Random;
import java.util.StringJoiner;

public class BikeSingleton {

    private static BikeSingleton instance;
    private final Long id;

    private BikeSingleton() {
        id = new Random().nextLong();
    }

    public static BikeSingleton getInstance() {
        if (instance == null) {
            synchronized (BikeSingleton.class) {
                if (instance == null) {
                    instance = new BikeSingleton();
                }
            }
        }
        return instance;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", BikeSingleton.class.getSimpleName() + "[", "]")
                .add("id=" + id)
                .toString();
    }
}
