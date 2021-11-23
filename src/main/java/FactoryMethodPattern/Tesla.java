package FactoryMethodPattern;

public class Tesla extends Car{//Concrete product
    @Override
    public void printSpeedLimit() {
        System.out.println("Tesla speed limit is 180 km/h!");
    }
}
