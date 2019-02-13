package com.company;

public class Car extends Vehicle {
    private int mph;

    //constructor
    public Car(){
        mph = 0;
    }

    //overloaded constructor
    public Car(String color, String make) {
        setColor(color);
        setMake(make);
    }

    // methods to indicate car actions
    public String startCar() {
        return "The " + getColor() + " " + getMake() + " " + getModel() + " is starting";
    }

    public String accelerate() {
        return "The " + getColor() + " " + getMake() + " " + getModel() + " is accelerating";
    }

    public String getMph() {
        return "The " + getColor() + " " + getMake() + " " +  getModel() + " is going " + mph + " mph";
    }

    public void setMph(int mph) {
        this.mph = mph;
    }

    public String stopCar() {
        return "The " + getColor() + " " + getMake() + " " + getModel() + " has stopped";
    }

    public String stopCarEmissions() {
        return "The " + getColor() + " " + getMake() + " " + getModel() + " has stopped to have its emissions checked";
    }

    public String passEmissions() {
        return "The " + getColor() + " " + getMake() + " " + getModel() + " passes its emission test";
    }

    public String passCar(Vehicle vehicle, Vehicle vehicle2) {
        return "The " + vehicle.getColor() + " " + vehicle.getMake() + " " + vehicle.getModel() + " just passed the" + " " + vehicle2.getColor() + " " + vehicle2.getMake() + " " + vehicle2.getModel();
    }

    //method to display cars entered into array list
    public String displayCars(){
        return String.format("A %s %s %s.", this.getColor(),this.getMake(),this.getModel());   }
}

