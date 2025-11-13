package org.example.arge;

public class ElectricCar extends CarSkeleton {
    private double avgKmPerCharge;
    private int batterySize;


    public ElectricCar(double avgKmPerCharge, int batterySize) {
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }

    public ElectricCar(String name, String description, double avgKmPerCharge, int batterySize) {
        super(name, description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }

    public void setAvgKmPerCharge(double avgKmPerCharge) {
        this.avgKmPerCharge = avgKmPerCharge;
    }

    public void setBatterySize(int batterySize) {
        this.batterySize = batterySize;
    }

    public double getAvgKmPerCharge() {
        return avgKmPerCharge;
    }

    public int getBatterySize() {
        return batterySize;
    }
    @Override
    public String drive() {
        runEngine();
        String message = getClass().getSimpleName() + ": Electric car is driving silently...";
        System.out.println(message);
        return message;
    }

    @Override
    protected String runEngine() {
        String message = getClass().getSimpleName() + ": Electric motor running, batterySize=" + batterySize;
        System.out.println(message);
        return message;
    }

}
