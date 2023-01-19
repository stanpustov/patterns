package pattern.creational.singleton;

import java.util.concurrent.CompletableFuture;

public class Application {

    public static void main(String[] args) {
        System.out.println("Start ....");
        CompletableFuture.allOf(
                CompletableFuture.runAsync(() -> System.out.println(BikeSingleton.getInstance())),
                CompletableFuture.runAsync(() -> System.out.println(BikeSingleton.getInstance())),
                CompletableFuture.runAsync(() -> System.out.println(BikeSingleton.getInstance())),
                CompletableFuture.runAsync(() -> System.out.println(BikeSingleton.getInstance()))
        ).join();
        System.out.println("Finish ....");

    }
}
