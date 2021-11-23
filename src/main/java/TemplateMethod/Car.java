package TemplateMethod;

abstract class Car { // Template class
    public void dailyUsage() { // Template method
    startCar();
    driveCar();
    fillCar();
    parkCar();
    shotDownCar();
    }
    //individual methods of template
                                    //have to be implemented
    abstract void startCar();
    abstract void fillCar();

                                    //could stay unchanged
    public void driveCar() {
        System.out.println("Driving the car!");
    }

    public void parkCar() {
        System.out.println("Parking the car!");
    }
    public void shotDownCar() {
        System.out.println("Shutting the car down!");
    }
}
