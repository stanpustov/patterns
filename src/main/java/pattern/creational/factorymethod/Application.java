package pattern.creational.factorymethod;

import pattern.creational.builder.CityBike;
import pattern.creational.builder.RoadBike;

public class Application {

    public static void main(String[] args) {

        System.out.println("Start ....");
        System.out.println(new CityBikeWorkshop().doBrakesService(CityBike.builder().build()));
        System.out.println(new RoadBikeWorkshop().doScheduledService(RoadBike.builder().build()));
        System.out.println("Finish ....");

    }
}
