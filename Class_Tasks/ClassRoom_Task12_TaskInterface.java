// Define an interface
interface Drawable {
    void draw();
}

// Rectangle implements Drawable
class Rectangle implements Drawable {
    public void draw() {
        System.out.println("Drawing rectangle");
    }
}

// Circle implements Drawable
class Circle implements Drawable {
    public void draw() {
        System.out.println("Drawing circle");
    }
}

// Test class
public class TestInterface {
    public static void main(String[] args) {
        Drawable d = new Circle(); // Polymorphism in action
        d.draw();
    }
}
