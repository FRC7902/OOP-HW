/**
 * The program starts here. Click "Run" above main() to try it.
 */
public class Main {

    public static void main(String[] args) {
        // Build two objects from the same Car blueprint
        Car car1 = new Car("Toyota");
        Car car2 = new Car("Honda");

        // Use the dot to call methods on each object
        car1.accelerate();
        car1.accelerate();
        car2.accelerate();

        // Each object keeps its own values
        System.out.println(car1.brand + " speed: " + car1.speed); // Toyota speed: 20
        System.out.println(car2.brand + " speed: " + car2.speed); // Honda speed: 10

        car1.brake();
        System.out.println(car1.brand + " speed: " + car1.speed); // Toyota speed: 0
    }
}
