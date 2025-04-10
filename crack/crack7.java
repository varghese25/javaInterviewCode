abstract sealed class Animal permits Dog {
}

final class Dog extends Animal {
    Dog() {
        System.out.println("Dog born");
    }
}

public class crack7 {

    public static void main(String[] args) {
        Animal a = new Dog();

    }

}