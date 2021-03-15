package com.company;

public class Mawina {
    private String vodila;
    private int skorost;

    void increaseSpeed() {
        System.out.println("I want to increase speed");
    }

    public Mawina(String driver, int speed) {
        setVodila(driver);
        setSkorost(speed);
    }

    public String getVodila() {
        return vodila;
    }

    public void setVodila(String vodila) {
        this.vodila = vodila;
    }

    public int getSkorost() {
        return skorost;
    }

    public void setSkorost(int skorost) {
        this.skorost = skorost;
    }

    void goToFuelCenter() {
        System.out.println("We need fuel!");
    }

    @Override
    public String toString() {
        return vodila +" is moving car with " + skorost +"km/h.";

    }
}