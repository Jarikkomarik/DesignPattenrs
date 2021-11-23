package TemplateMethod;

public class Tesla extends Car{ //Tesla implementation of template methods realization
    @Override
    public void startCar() {
        System.out.println("Turning on Tesla!");
    }

    @Override
    public void driveCar() {
        System.out.println("Using autopilot!");
    }

    @Override
    public void fillCar() {
        System.out.println("Charging Tesla!");
    }

    @Override
    public void parkCar() {
        System.out.println("Auto-parking Tesla");
    }
}
