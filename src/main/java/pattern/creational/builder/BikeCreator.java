package pattern.creational.builder;

public class BikeCreator {

    public IBikeBuilder<RoadBike> createRimRoadBike(IBikeBuilder<RoadBike> builder) {
        return builder
                .withFrame("Factor O2 VAM")
                .withWheels("Lightweight Meilenstein")
                .withHandlebar("Bjorn Rool")
                .withSaddle("Bjorn Probka")
                .withBrake("Rim Brake")
                .withTransmission("Shimano Dura-Ace DI2");
    }

    public IBikeBuilder<RoadBike> createDiskRoadBike(IBikeBuilder<RoadBike> builder) {
        return builder
                .withFrame("Specialized Aethos")
                .withWheels("Roval Alpinist")
                .withHandlebar("Bjorn Rool")
                .withSaddle("Bjorn Setka")
                .withBrake("Disk Brake")
                .withTransmission("Sram RED AXS");
    }

    public IBikeBuilder<CityBike> createCityBike(IBikeBuilder<CityBike> builder) {
        return builder
                .withFrame("VTB Frame")
                .withWheels("Aist")
                .withHandlebar("Palka")
                .withSaddle("Divan")
                .withBrake("No Brake")
                .withRack("Big Rack")
                .withFender("Wide Steel Heavy Fenders");
    }

}
