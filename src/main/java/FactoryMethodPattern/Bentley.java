package FactoryMethodPattern;

public class Bentley extends Car{//Concrete product
    @Override
    public void printSpeedLimit() {
        System.out.println("Bentley speed limit is 300 km/h!");
    }
}
