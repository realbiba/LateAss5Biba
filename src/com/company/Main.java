package com.company;

import java.lang.reflect.InvocationTargetException;

public class Main {

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Mawinaconf stateOfCar = new Mawinaconf() {
            @Override
            public void stop() {
                System.out.println("Oh,no we have fuel!");
            }
        };
        stateOfCar.start();

        final Mawina Car = Mawina.class.getConstructor(String.class, int.class).newInstance("Jane",100);
        System.out.println(Car);
        Car.increaseSpeed();
        stateOfCar.stop();
        Car.goToFuelCenter();
    }
}