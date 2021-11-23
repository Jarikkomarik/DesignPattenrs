package Factory;

public class CarClient {
    public static void main(String[] args) {
        Car MyBmw = CarFactory.newInstance(Cars.BMW);   // assigning return value from  CarFactory.newInstance(Cars.BMW) to Car var
        MyBmw.printMSG();
        Car MyAudi = CarFactory.newInstance(Cars.Audi); // assigning return value from  CarFactory.newInstance(Cars.Audi) to Car var
        MyAudi.printMSG();
    }
}
