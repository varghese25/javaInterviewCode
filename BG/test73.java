class Animal {
    Animal() {
        System.out.println("Animal constructor");
    }
}

class Dog extends Animal {
    Dog() {
        System.out.println("Dog constructor");
    }
}

public class test73 {
    public static void main(String[] args) {
        Dog d = new Dog();
    }

}

/*
 * Answer and Explanation:
 * 
 * In Java, when a subclass object is created, the constructor of its superclass
 * is invoked first automatically before the subclass constructor. So:
 * 
 * Animal() runs first
 * 
 * Then Dog() runs
 */