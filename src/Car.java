/**
 * A class is a blueprint. This one describes what every Car knows and can do.
 */
public class Car {

    // Fields: what a Car knows (its state)
    String brand;
    int speed;

    // Constructor: runs once, when we use "new", to set up the object
    Car(String carBrand) {
        brand = carBrand;
        speed = 0;
    }

    // Methods: what a Car can do (its behaviour)
    void accelerate() {
        speed = speed + 10;
    }

    void brake() {
        speed = 0;
    }
}
