package pattern.creational.abstractfactory;

import pattern.creational.abstractfactory.model.Bike;
import pattern.creational.abstractfactory.model.CyclingApparel;

public class CyclingAdventure {

    private final CyclingApparel cyclingApparel;
    private final Bike bike;

    CyclingAdventure(AbstractCyclingFactory factory) {
        cyclingApparel = factory.createCyclingApparel();
        bike = factory.createBike();
    }

    public void start() {
        System.out.println("Start adventure");
        cyclingApparel.putOn();
        bike.rideOnBike();
        System.out.println("End....");
    }
}
