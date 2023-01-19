package pattern.creational.factorymethod.servicework;

import pattern.creational.builder.RoadBike;

import java.math.BigDecimal;

public class RoadBikeServiceWork implements IServiceWork {

    private RoadBike bike;

    public RoadBikeServiceWork(RoadBike bike) {
        this.bike = bike;
    }

    @Override
    public ServiceReport doScheduledService() {
        // make work's
        return new ServiceReport(new BigDecimal(2000),
                RoadBike.class.getSimpleName() + ":doScheduledService");
    }

    @Override
    public ServiceReport doBrakesService() {
        // make work's
        return new ServiceReport(new BigDecimal(500),
                RoadBike.class.getSimpleName() + ":doBrakesService");
    }
}
