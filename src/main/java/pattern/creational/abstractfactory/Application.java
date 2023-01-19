package pattern.creational.abstractfactory;

public class Application {

    public static void main(String[] args) {
        new CyclingAdventure(new RoadCyclingFactory()).start();
        new CyclingAdventure(new GravelCyclingFactory()).start();
    }
}
