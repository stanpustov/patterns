package pattern.creational.factorymethod;

import pattern.creational.factorymethod.servicework.IServiceWork;
import pattern.creational.factorymethod.servicework.RoadBikeServiceWork;
import pattern.creational.builder.RoadBike;

public class RoadBikeWorkshop extends BikeWorkshop<RoadBike> {

    @Override
    protected IServiceWork takeBikeInWork(RoadBike bike) {
        return new RoadBikeServiceWork(bike);
    }
}
