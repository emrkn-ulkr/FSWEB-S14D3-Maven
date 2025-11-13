package org.example.company;

public class Mitsubishi extends Car{

    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        String msg= getClass().getSimpleName()+"the car's engine is starting";
        return msg;
    }

    @Override
    public String accelerate() {
        String msg = getClass().getSimpleName()+"the car is accelerating";
        return msg;
    }

    @Override
    public String brake() {
        String msg = getClass().getSimpleName()+"the car is braking";
        return msg;
    }
}
