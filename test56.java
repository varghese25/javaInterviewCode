
abstract class A { //
    A() { // Constructor of A
          // Constructor of A is called first
          // before the constructor of B
          // because B is a subclass of A
          // and A's constructor is called first
        System.out.println("A's Constructor");
    }

    abstract void display(); // Abstract method in A

}

class B extends A { // B is a subclass of A
    B() {// Constructor of B is
         // Constructor of B is called after the constructor of A
        System.out.println("B's Constructor"); // Constructor of B
    }

    void display() { // Implementation of abstract method in A
        // This method is overridden in B
        // and provides the implementation for the abstract method in A

        System.out.println("Display method in B"); // Display method in B
    }
}

public class test56 { // Main class
    public static void main(String args[]) {
        A obj = new B(); // Create an object of B using A's reference
        obj.display(); // Call the display method using A's reference
        // This will call the overridden method in B
    }
}
// Output:
// A's Constructor // B's Constructor

// in this code how execution flow works?
// 1. The main method is executed, and an object of class B is created using A's
// reference (A obj = new B();).
