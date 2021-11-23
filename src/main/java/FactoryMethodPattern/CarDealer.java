package FactoryMethodPattern;

public class CarDealer extends CarFactory{ //Concrete creator
    @Override
    public Car createCar(String make) {
        switch (make){
            case "audi": return new Audi();
            case "mercedes": return new Mercedes();
            case "tesla": return new Tesla();
            case "bentley": return new Bentley();
            default:
                throw new RuntimeException("no such car available");
        }
    }
}
