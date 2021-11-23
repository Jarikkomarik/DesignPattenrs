package FactoryMethodPattern;

public class Client { // client side
    public static void main(String[] args) {
        CarDealer dealer = new CarDealer();
        Car mercedes = dealer.createCar("mercedes");
        Car audi = dealer.createCar("audi");
        Car tesla = dealer.createCar("tesla");
        mercedes.printSpeedLimit();
        audi.printSpeedLimit();
        tesla.printSpeedLimit();

        /*
        Output
        Mercedes speed limit is 240 km/h!
        Audi speed limit is 260 km/h!
        Tesla speed limit is 180 km/h!
         */

        //to create new car. Instantiate another Car and add Dealer option for desired car

        Car bentley = dealer.createCar("bentley");
        bentley.printSpeedLimit();
        /*
        Output
        Bentley speed limit is 300 km/h!
        */
    }
}
