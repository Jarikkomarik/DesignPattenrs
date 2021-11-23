package TemplateMethod;

public class Audi extends Car{ //audi implementation of template methods realization
    @Override
    public void startCar() {
        System.out.println("Starting engine!");
    }

    @Override
    public void fillCar() {
        System.out.println("Filling car with diesel!");
    }
}
