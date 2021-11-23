package Factory;

import java.util.InputMismatchException;

public class CarFactory { //class that is used to create new cars
    static Car newInstance (Cars a) { //method that returns new car or none, based on argument.
        switch (a) {
            case BMW:
                return new Bmw();

            case Audi:
                return new Audi();
        }

        throw new InputMismatchException();
    }
}
