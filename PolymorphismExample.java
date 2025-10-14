// Example of Polymorphism in Java

class Shape {
    void draw() {
        System.out.println("Drawing a shape");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing a circle");
    }
}

class Square extends Shape {
    void draw() {
        System.out.println("Drawing a square");
    }
}

public class PolymorphismExample {
    public static void main(String[] args) {
        Shape s;

        s = new Circle();  // Shape reference → Circle object
        s.draw();          // Calls Circle's draw()

        s = new Square();  // Shape reference → Square object
        s.draw();          // Calls Square's draw()
    }
}
