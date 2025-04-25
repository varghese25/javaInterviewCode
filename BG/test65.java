abstract class A {
    A() {
        System.out.print("A "); // 1. A's constructor called
    }
}

class B extends A {
    B() {
        System.out.print("B "); // 2. B's constructor called
    }
}

public class test65 {
    public static void main(String[] args) {

        A obj = new B();
        // System.out.println("0"); // Object creation starts from here since. My
        // expection is AB.checking purpose i have written here
    }
}
// Out Put is A B