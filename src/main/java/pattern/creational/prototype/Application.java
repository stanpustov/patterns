package pattern.creational.prototype;

import pattern.creational.builder.BikeCreator;
import pattern.creational.builder.CityBike;

import java.util.ArrayList;

public class Application {

    public static void main(String[] args) {
        var creator = new BikeCreator();
        var oemBike = creator.createCityBike(CityBike.builder()).build();

        var bike = new AuchanBike(oemBike);
        var bikes = new ArrayList<AuchanBike>();
        try {
            for (int i = 0; i < 3; i++) {
                bikes.add(bike);
                bike = (AuchanBike) bike.clone();
            }
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        System.out.println("Start ....");
        bikes.forEach(System.out::println);
        System.out.println("Finish ....");
    }
}
