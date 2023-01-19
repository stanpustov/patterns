package pattern.creational.factorymethod;

import pattern.creational.factorymethod.servicework.CityBikeServiceWork;
import pattern.creational.factorymethod.servicework.IServiceWork;
import pattern.creational.builder.CityBike;

public class CityBikeWorkshop extends BikeWorkshop<CityBike> {

    @Override
    protected IServiceWork takeBikeInWork(CityBike bike) {
        return new CityBikeServiceWork(bike);
    }
}
