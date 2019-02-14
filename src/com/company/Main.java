package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //calling methods
        carClassApp();
        System.out.println();
        carClassApp2();
        System.out.println();
        enterCar();
        System.out.println();
        whosDriving();
    }

    //method for first task
    public static void carClassApp(){
        //setting new car instance
        Car a = new Car();
        a.setMake("Porsche");
        a.setModel("Carrera");
        a.setColor("red");
        //calling methods for car actions
        System.out.println(a.startCar());
        System.out.println(a.accelerate());
        //setting a specific speed for car
        a.setMph(50);
        System.out.println(a.getMph());
        System.out.println(a.stopCar());

    }

    //method for second task
    public static void carClassApp2(){

        //new car
        Car a = new Car();
        a.setMake("Porsche");
        a.setModel("Carrera");
        a.setColor("red");
        //new car
        Car b = new Car();
        b.setMake("Volkswagon");
        b.setModel("Jetta");
        b.setColor("blue");
        //calling methods for car actions
        System.out.println(a.startCar());
        System.out.println(b.startCar());
        System.out.println(a.accelerate());
        System.out.println(b.accelerate());
        System.out.println(b.stopCarEmissions());
        System.out.println(b.passEmissions());
        //setting a specific speed for car
        a.setMph(50);
        System.out.println(a.getMph());
        System.out.println(a.stopCar());
        System.out.println(b.passCar(a, b));

    }

    //user created cars
    public static void enterCar(){
        Scanner keyboard = new Scanner(System.in);
        //array list to hold newly created cars
        ArrayList<Car> cars = new ArrayList<>();
        //able to continue entering new cars until user enter (n) making this false
        while(true) {
            //create new car and enter its attributes
            System.out.print("Enter make: ");
            Car c = new Car();
            //use nextLine to ensure buffer is clear
            String make = keyboard.nextLine();
            c.setMake(make);
            System.out.print("Enter model: ");
            String model = keyboard.nextLine();
            c.setModel(model);
            System.out.print("Enter color: ");
            String color = keyboard.nextLine();
            c.setColor(color);

            //Add the car to the array list
            cars.add(c);

            //allow the user to enter another car or else break loop
            System.out.println("Do you want to enter a new car? (y/n)");
            if (keyboard.nextLine().equalsIgnoreCase("n")){
                break;
            }
        }

        //print out the cars - display
        System.out.println("The car(s) entered: ");
        for (Car eachCar: cars) {
            System.out.println(eachCar.displayCars());
        }

        System.out.println("End!");
    }
    //part of composition exercise
    public static void whosDriving(){
        //create new car.....the parameters come from the overloaded constructor which takes 2 arguments
        Car d = new Car("Black", "Cadillac");
        //create new driver
        Driver driver = new Driver();
        //set his name using person.java and driver.java
        driver.setName("Ricky Bobby");
        System.out.println("The " + d.getColor() + " " + d.getMake() + " is being driven by " + driver.getName());

    }
}

