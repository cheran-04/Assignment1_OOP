// Example of Inheritance in Java

// Parent class
class Animal {
    void sound() {
        System.out.println("Animals make sounds");
    }
}

// Child class inheriting from Animal
class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound(); // Calls Dog's sound method
    }
}
