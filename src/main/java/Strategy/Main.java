package Strategy;

public class Main {
    public static void main(String[] args) {
        Car BMWI = new Car("BMW", 150, "el");
        BMWI.setStartUp(new ElectricStartUp()); //passing instance of desired startUp interface implementation
        BMWI.start();// Electric start!

        Car audi = new Car("AudiA4", 250, "v8");
        audi.setStartUp(new PetrolStartUp());  //passing instance of desired startUp interface implementation
        audi.start();// petrol start!
    }
}
