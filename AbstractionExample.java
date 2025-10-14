// Abstract class (the "what")
abstract class Vehicle {
    // Abstract methods (what it can do)
    abstract void accelerate();
    abstract void brake();
    
    // Concrete method (common to all vehicles)
    void startEngine() {
        System.out.println("Engine started!");
    }
}

// Concrete implementation (the "how")
class Car extends Vehicle {
    @Override
    void accelerate() {
        System.out.println("Car: Pressing gas pedal...");
        // Hidden complex logic: fuel injection, gear shifting, etc.
    }
    
    @Override
    void brake() {
        System.out.println("Car: Applying brakes...");
        // Hidden logic: hydraulic pressure, brake pads, etc.
    }
}

// Main class to run the example
public class AbstractionExample {
    public static void main(String[] args) {
        // We only care about what the Vehicle can do, not how it does it.
        Vehicle myCar = new Car();
        
        myCar.startEngine();  // Call a concrete method from the abstract class
        myCar.accelerate();   // Call an abstract method implemented by Car
        myCar.brake();        // Call another abstract method implemented by Car
    }
}