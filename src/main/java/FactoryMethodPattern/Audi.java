package FactoryMethodPattern;

public class Audi extends Car{//Concrete product

    @Override
    public void printSpeedLimit() {
        System.out.println("Audi speed limit is 260 km/h!");
    }
}
