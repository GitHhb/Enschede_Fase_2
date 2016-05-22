package eu.programit.autofabriek;

import java.lang.reflect.Constructor;

abstract class Car {
    public abstract void drive();
}

public class Main {
    public static void main(String[] args) {
        Car c = CarFactory.getInstance("BMW");
        c.drive();
        CarFactory.getInstance("AlfaRomeo").drive();
    }
}

final class CarFactory {
    public static Car getInstance(String type) {
//        Car c = new Constructor<type>.newInstance();
        switch (type) {
            case "BMW":
                return new BMW();
            case "AlfaRomeo":
                return new AlfaRomeo();
            case "Lambo":
                return new Lambo();
        }
        return null;
    }
}

class AlfaRomeo extends Car {
    public void drive(){
        System.out.println("Driving my Alfa");
    }
}

class BMW extends Car {
    @Override
    public void drive() {
        System.out.println("Driving my BMW");
    }
}

class Lambo extends Car {
    @Override
    public void drive() {
        System.out.println("Driving my Lambo");
    }
}
