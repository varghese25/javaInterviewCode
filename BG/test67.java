abstract class Shape {
    abstract void draw();
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing Circle");
    }
}

public class test67 {
    public static void main(String[] args) {
        Shape s = new Circle();
        s.draw();
    }

}
/*
 * Answer and Explanation:
 * 
 * 1. Drawing Circle
 * 
 * Explanation:
 * 
 * Shape is an abstract class with an abstract method draw().
 * 
 * Circle is a concrete subclass that overrides the draw() method.
 * 
 * In main(), a reference of type Shape is assigned to a Circle object (Shape s
 * = new Circle();), and the draw() method is called.
 * 
 * This is an example of runtime polymorphism in Java, and it correctly prints:
 * 
 * 
 * Drawing Circle
 */