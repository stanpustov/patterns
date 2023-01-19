package pattern.creational.abstractfactory;

import pattern.creational.abstractfactory.model.Bike;
import pattern.creational.abstractfactory.model.CyclingApparel;

public interface AbstractCyclingFactory {

    Bike createBike();
    CyclingApparel createCyclingApparel();

}
