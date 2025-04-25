
class Parent {
    void show() {
        System.out.println("Parent's show()");
    }
}

class Child extends Parent {
    void show() {
        System.out.println("Child's show()");
    }
}

public class test69 {
    public static void main(String[] args) {
        Parent p = new Child();
        p.show();
    }
}

/*
 * This is an example of runtime polymorphism in Java.
 * Although the reference p is of type Parent, it refers to an object of type
 * Child. Hence, the overridden show() method in the Child class is executed at
 * runtime.
 */