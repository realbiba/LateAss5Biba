package com.company;



public interface Mawinaconf {
    void stop();
    default void start(){
        System.out.println("We are moving");
    }


}