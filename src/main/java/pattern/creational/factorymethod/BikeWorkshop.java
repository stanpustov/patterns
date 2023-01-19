package pattern.creational.factorymethod;

import pattern.creational.factorymethod.servicework.IServiceWork;
import pattern.creational.factorymethod.servicework.ServiceReport;
import pattern.creational.builder.Bike;

public abstract class BikeWorkshop<T extends Bike> {

    public ServiceReport doScheduledService(T bike) {
        IServiceWork serviceWork = takeBikeInWork(bike);
        return serviceWork.doScheduledService();
    }

    public ServiceReport doBrakesService(T bike) {
        IServiceWork serviceWork = takeBikeInWork(bike);
        return serviceWork.doBrakesService();
    }

    abstract protected IServiceWork takeBikeInWork(T bike);
}
