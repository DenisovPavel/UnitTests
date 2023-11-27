package Vehicle;

public abstract class Vehicle {
    private String company;
    private String model;
    private int yearRelease;
    private int numWheels;
    private int speed;

    public abstract int testDrive();

    public abstract int park();
}
