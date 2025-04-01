abstract class A {
    abstract void display();
}

class B extends A {
    void display() {
        System.out.println("Hello from B");
    }
}

public class test55s {
    public static void main(String args[]) {
        A obj = new B();
        obj.display();
    }
}
