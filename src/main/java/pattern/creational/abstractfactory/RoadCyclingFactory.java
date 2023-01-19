package pattern.creational.abstractfactory;

import pattern.creational.abstractfactory.model.Bike;
import pattern.creational.abstractfactory.model.CyclingApparel;
import pattern.creational.abstractfactory.model.RoadBike;
import pattern.creational.abstractfactory.model.RoadCyclingApparel;

public class RoadCyclingFactory implements AbstractCyclingFactory {
    @Override
    public Bike createBike() {
        return new RoadBike();
    }

    @Override
    public CyclingApparel createCyclingApparel() {
        return new RoadCyclingApparel();
    }
}
