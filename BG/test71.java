class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

public class test71 {

    public static void main(String[] args) {
        Animal a = new Dog();
        a.sound();
    }

}

/*
 * Answer and Explanation:
 * 
 * In this code:
 * 
 * Animal a = new Dog(); — this is upcasting. The reference is of type Animal,
 * but the object is of type Dog.
 * 
 * When a.sound() is called, runtime polymorphism (method overriding) ensures
 * that the Dog's version of sound() is executed.
 */