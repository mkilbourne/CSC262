class Car {

    // Properties (attributes) of the class
    String brand;
    int year;

    // Behavior (method) of the class
    void displayInfo() {
        System.out.println("Brand: " + brand + ", Year: " + year);
    }
}

public class Main {
    public static void main(String[] args) {

        // Creating OBJECTS from the Car class.
        // These are real instances that exist in memory.

        // Object 1
        Car car1 = new Car();   // car1 is an OBJECT
        car1.brand = "Toyota";
        car1.year = 2020;

        // Object 2
        Car car2 = new Car();   // car2 is another OBJECT
        car2.brand = "Honda";
        car2.year = 2022;

        // Displaying object data
        System.out.println("Car 1 Information:");
        car1.displayInfo();

        System.out.println("\nCar 2 Information:");
        car2.displayInfo();

        // Notice: The class Car is used as a blueprint,
        // but car1 and car2 are actual objects with their own data.
    }
}