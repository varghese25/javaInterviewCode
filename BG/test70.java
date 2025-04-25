interface A {
    void display();
}

class B implements A {
    public void display() {
        System.out.println("Display from B");
    }
}

public class test70 {
    public static void main(String[] args) {
        A obj = new B();
        obj.display();
    }

}

/*
 * 
 * Answer and Explanation:
 * 
 * interface A defines a method display().
 * 
 * class B implements interface A and provides the implementation for display().
 * 
 * In main(), A obj = new B(); uses polymorphism.
 * 
 * When obj.display() is called, it invokes the overridden method in B.
 */