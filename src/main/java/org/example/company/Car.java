package org.example.company;
import java.util.Objects;

public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.engine = true;
        this.wheels = 4;
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    //   ***   ***   ***   ***   ***   ***
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Car car = (Car) obj;
        return cylinders == car.cylinders && Objects.equals(name, car.name);
    }


    public String startEngine() {
        System.out.println(getClass().getSimpleName());
        return "the car's engine is starting";
    }

    public String accelerate() {
        System.out.println(getClass().getSimpleName());
        return "the car is accelerating";
    }

    public String brake() {
        System.out.println(getClass().getSimpleName());
        return "the car is braking";
    }
}
