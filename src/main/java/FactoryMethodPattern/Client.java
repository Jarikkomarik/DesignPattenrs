package FactoryMethodPattern;

public class Client { // client side
    public static void main(String[] args) {
        CarDealer dealer = new CarDealer();
        Car mercedes = dealer.produceCar("mercedes");
        System.out.println();
        Car audi = dealer.produceCar("audi");
        System.out.println();
        Car tesla = dealer.produceCar("tesla");
        System.out.println();
        mercedes.printSpeedLimit();
        audi.printSpeedLimit();
        tesla.printSpeedLimit();
        System.out.println();

        /*
        Output
        Crating mercedes
        mercedes is ready!

        Crating audi
        audi is ready!

        Crating tesla
        tesla is ready!

        Mercedes speed limit is 240 km/h!
        Audi speed limit is 260 km/h!
        Tesla speed limit is 180 km/h!
         */

        //to create new car. Instantiate another Car and add Dealer option for desired car

        Car bentley = dealer.produceCar("bentley");
        System.out.println();
        bentley.printSpeedLimit();
        /*
        Output
        Crating bentley
        bentley is ready!

        Bentley speed limit is 300 km/h!
        */
    }
}
