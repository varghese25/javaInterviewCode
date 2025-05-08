
class A {
    static {
        System.out.print("A ");
    }

    A() {
        System.out.print("a ");
    }
}

class B extends A {
    static {
        System.out.print("B ");
    }

    B() {
        System.out.print("b ");
    }
}

public class crack10 {
    public static void main(String[] args) {
        new B();
    }

}

/*
 * 
 * Explanation
 * 
 * class A (Base class)
 * 
 * class B extends A (Subclass)
 * 
 * Both have: A static block , A constructor
 * 
 * 
 * 
 * Main Concepts
 * 
 * 1. Static blocks run once per class when the class is first loaded.
 * 
 * 2. Superclass static blocks run before subclass static blocks.
 * 
 * 3. Constructors run every time you create an object.
 * 
 * 4. Superclass constructors run before subclass constructors.
 * 
 * 
 * 
 * 
 * 
 * Execution Steps:
 * 
 * new B(); starts:
 * 
 * Class A is loaded -> prints A
 * 
 * Class B is loaded -> prints B
 * 
 * 
 * 
 * Now object creation:
 * 
 * Constructor A() runs -> prints a
 * 
 * Then constructor B() runs -> prints b
 * 
 * 
 */

/*
 * Step-by-Step Execution:
 * 
 * 💡 Before main() starts:
 * Java needs to load class B because you're creating new B().
 * 
 * It sees that B extends A, so it first loads class A:
 * 
 * Runs static block of A → prints: Static Block of A
 * 
 * Then, it loads B:
 * 
 * Runs static block of B → prints: Static Block of B
 * 
 * 🟢 Inside main():
 * "Main starts" is printed.
 * 
 * new B() creates an object:
 * 
 * Calls constructor of A first → prints: Constructor of A
 * 
 * Then calls constructor of B → prints: Constructor of B
 * 
 * "Main ends" is printed.
 */