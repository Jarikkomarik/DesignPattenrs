package Factory;

public interface Car { //Root interface

    default void printMSG(){
        System.out.println("im a car");
    }
}
