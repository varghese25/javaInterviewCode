import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");

        System.out.println(fruits.get(1)); // Output: Banana
    }
}

/*
 * [Index]      0       1       2
 *          [Apple] [Banana] [Mango]
 */