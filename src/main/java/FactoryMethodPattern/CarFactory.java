package FactoryMethodPattern;

abstract class CarFactory { //creator
    public abstract Car createCar(String make);

    public Car produceCar (String make){
        Car producedCar = createCar(make);
        System.out.println("Crating " +make);
        System.out.println(make + " is ready!");
        return producedCar;
    }
}
