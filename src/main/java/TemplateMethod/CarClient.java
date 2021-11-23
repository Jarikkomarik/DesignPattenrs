package TemplateMethod;

public class CarClient {
    public static void main(String[] args) {
        Car audi = new Audi(); // creating car heir
        Car tesla = new Tesla();// creating car heir
        audi.dailyUsage();  //calling template method
        System.out.println("==================");
        tesla.dailyUsage(); //calling template method

        /*
        * Output:
        *                   **|Audi execution|**
        * Starting engine!
        * Driving the car!
        * Filling car with diesel!
        * Parking the car!
        * Shutting the car down!
        * ==================
        *                   **|Tesla execution|**
        * Turning on Tesla!
        * Using autopilot!
        * Charging Tesla!
        * Auto-parking Tesla
        * Shutting the car down!
        * */
    }
}
