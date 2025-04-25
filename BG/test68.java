abstract class Animal {
    abstract void sound();
}

class Dog extends Animal {
    void sound() {
        System.out.println("Bark");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("Meow");
    }
}

public class test68 {
    public static void main(String[] args) {
        Animal a = new Cat();
        a.sound();
    }

}

/*
 * Answer and Explanation:
 * 
 * Animal is an abstract class with an abstract method sound().
 * Cat and Dog classes extend Animal and provide their own implementation of
 * sound().
 * In main(), an Animal reference a is assigned to a Cat object.
 * Calling a.sound() invokes the Cat's version of the method due to runtime
 * polymorphism.
 * 
 * Hence, the output is:
 * 
 * Meow
 */