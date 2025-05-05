abstract class Vehicle {
    abstract void start();
}

class Car extends Vehicle {
    void start() {
        System.out.println("Car starts with key");
    }
}

public class test81 {
    public static void main(String[] args) {
        Vehicle v = new Car();
        v.start();
    }

}

/*
 * Answer and Explanation:
 * 
 * Vehicle is an abstract class with an abstract method start().
 * 
 * Car extends Vehicle and provides the concrete implementation of start().
 * 
 * In main, a reference of type Vehicle holds an object of Car, and calling
 * v.start() invokes the overridden method in Car.
 * 
 * This is runtime polymorphism in action.
 */