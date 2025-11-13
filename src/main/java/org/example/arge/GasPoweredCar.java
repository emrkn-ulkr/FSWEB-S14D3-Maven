package org.example.arge;

public class GasPoweredCar extends CarSkeleton {
    private double avgKmPerLitre;
    private int cylinders;

    public void setAvgKmPerLitre(double avgKmPerLitre) {
        this.avgKmPerLitre = avgKmPerLitre;
    }

    public int getCylinders() {
        return cylinders;
    }

    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }

    public GasPoweredCar(double avgKmPerLitre, int cylinders) {
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
    }

    public GasPoweredCar(String name, String description, double avgKmPerLitre, int cylinders) {
        super(name, description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
    }

    public GasPoweredCar(double avgKmPerLitre) {
        this.avgKmPerLitre = avgKmPerLitre;
    }


    public double getAvgKmPerLitre() {
        return avgKmPerLitre;
    }

    @Override
    public String startEngine() {
        String message = getClass().getSimpleName() + ": Gas Engine Started with " + cylinders + " cylinders";
        System.out.println(message);
        return message;
    }

    @Override
    public String drive() {
        runEngine();
        String message = getClass().getSimpleName() + ": Gas car is driving...";
        System.out.println(message);
        return message;
    }

    @Override
    protected String runEngine() {
        String message = getClass().getSimpleName() + ": Gas engine is running, avgKmPerLitre=" + avgKmPerLitre;
        System.out.println(message);
        return message;
    }
}
