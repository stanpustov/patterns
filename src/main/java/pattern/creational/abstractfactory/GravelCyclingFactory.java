package pattern.creational.abstractfactory;

import pattern.creational.abstractfactory.model.Bike;
import pattern.creational.abstractfactory.model.CyclingApparel;
import pattern.creational.abstractfactory.model.GravelBike;
import pattern.creational.abstractfactory.model.GravelCyclingApparel;

public class GravelCyclingFactory implements AbstractCyclingFactory {
    @Override
    public Bike createBike() {
        return new GravelBike();
    }

    @Override
    public CyclingApparel createCyclingApparel() {
        return new GravelCyclingApparel();
    }
}
