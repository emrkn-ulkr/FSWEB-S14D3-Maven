package org.example.arge;

public class CarSkeleton {
    private String name;
    private String description;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public CarSkeleton() {
    }

    public CarSkeleton(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String startEngine() {
        String message = getClass().getSimpleName() + ": Engine Started";
        System.out.println(message);
        return message;
    }

    public String drive() {
        runEngine();
        String message = getClass().getSimpleName() + ": Driving...";
        System.out.println(message);
        return message;
    }

    protected String runEngine() {
        String message = getClass().getSimpleName() + ": Engine is running...";
        System.out.println(message);
        return message;
    }
}
