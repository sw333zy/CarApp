package com.company;
public class Vehicle {
    private String make;
    private String model;
    private String color;

    //constructor
    public Vehicle(){
        make = "";
        model = "";
        color = "";

    }

    //setting and getting car attributes
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}