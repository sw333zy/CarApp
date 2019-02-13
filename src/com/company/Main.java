package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        carClassApp();
        System.out.println();
        carClassApp2();
        System.out.println();
        enterCar();

    }

    public static void carClassApp(){
        Car a = new Car();
        a.setMake("Porsche");
        a.setModel("Carrera");
        a.setColor("red");

        System.out.println(a.startCar());
        System.out.println(a.accelerate());
        a.setMph(50);
        System.out.println(a.getMph());
        System.out.println(a.stopCar());

    }

    public static void carClassApp2(){
        Car a = new Car();
        a.setMake("Porsche");
        a.setModel("Carrera");
        a.setColor("red");

        Car b = new Car();
        b.setMake("Volkswagon");
        b.setModel("Jetta");
        b.setColor("blue");

        System.out.println(a.startCar());
        System.out.println(b.startCar());
        System.out.println(a.accelerate());
        System.out.println(b.accelerate());
        System.out.println(b.stopCarEmissions());
        System.out.println(b.passEmissions());
        a.setMph(50);
        System.out.println(a.getMph());
        System.out.println(a.stopCar());
        System.out.println(b.passCar(a, b));

    }

    public static void enterCar(){
        Scanner keyboard = new Scanner(System.in);
        ArrayList<Car> cars = new ArrayList<>();
        while(true) {
            System.out.print("Enter make: ");
            Car c = new Car();
            //use nextLine to ensure buffer is clear
            String make = keyboard.nextLine();
            c.setMake(make);
            System.out.print("Enter model: ");
            String model = keyboard.nextLine();
            c.setModel(model);

            //Add the car to the arraylist
            cars.add(c);

            //allow the user to enter another car
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
}

