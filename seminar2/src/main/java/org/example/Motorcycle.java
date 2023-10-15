package org.example;

public class Motorcycle extends Vehicle{

    public Motorcycle(String company, String model, int yearRelease) {
        this.company = company;
        this.model = model;
        this.yearRelease = yearRelease;
        this.numWheels = 2;
        this.speed = 0;
    }

    @Override
    public void testDrive() {
        this.speed = 75;
    }

    @Override
    public void park() {
        this.speed = 0;
    }

}
