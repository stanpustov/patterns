package pattern.creational.builder;

public class Application {

    public static void main(String[] args) {
        var creator = new BikeCreator();
        var cityBike = creator.createCityBike(CityBike.builder()).build();
        var roadBike1 = creator.createRimRoadBike(RoadBike.builder()).build();
        var roadBike2 = creator.createDiskRoadBike(RoadBike.builder()).build();

        System.out.println("Start ....");
        System.out.println(cityBike);
        System.out.println(roadBike1);
        System.out.println(roadBike2);
        System.out.println(roadBike2);
        System.out.println("Finish ....");

    }
}
