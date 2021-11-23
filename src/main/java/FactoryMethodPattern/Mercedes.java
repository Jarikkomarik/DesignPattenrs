package FactoryMethodPattern;

public class Mercedes extends Car{//Concrete product

    @Override
    public void printSpeedLimit() {
        System.out.println("Mercedes speed limit is 240 km/h!");
    }
}
