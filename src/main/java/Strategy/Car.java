package Strategy;

public class Car {
    private String name;
    private int horsePower;
    private String engine;
    private StartUp startUp; // variable of Startup
    public Car(String name, int horsePower, String engine) {
        this.name = name;
        this.horsePower = horsePower;
        this.engine = engine;
    }

    public void setStartUp(StartUp startUp) {
        this.startUp = startUp; //setting startUp variable to refer to implementation of StartUp Interface form argument
    }

    public void start(){
        startUp.start(); // calling start() method of implementation of StartUp Interface
    }

}
