abstract class Animal {
    abstract void makeSound();
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Bark");
    }
}

public class test52 {
    public static void main(String[] args) {
        Animal obj = new Dog();
        obj.makeSound();
    }
}

/*
 * Answer and Explanation:
 * 
 * Abstraction is implemented using an abstract class (Animal), which contains
 * an abstract method makeSound().
 * 
 * The concrete subclass (Dog) provides an implementation for makeSound(),
 * printing "Bark".
 * 
 * In main(), we create an instance of Dog using a reference of type Animal.
 * 
 * When obj.makeSound() is called, runtime polymorphism ensures that the
 * overridden method in Dog executes, printing "Bark".
 */