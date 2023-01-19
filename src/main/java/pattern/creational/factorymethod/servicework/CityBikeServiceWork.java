package pattern.creational.factorymethod.servicework;

import pattern.creational.builder.CityBike;

import java.math.BigDecimal;

public class CityBikeServiceWork implements IServiceWork {

    private CityBike bike;

    public CityBikeServiceWork(CityBike bike) {
        this.bike = bike;
    }

    @Override
    public ServiceReport doScheduledService() {
        // make work's
        return new ServiceReport(new BigDecimal(1000),
                CityBike.class.getSimpleName() + ":doScheduledService");
    }

    @Override
    public ServiceReport doBrakesService() {
        // make work's
        return new ServiceReport(new BigDecimal(150),
                CityBike.class.getSimpleName() + ":doBrakesService");
    }
}
