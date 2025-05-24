import java.util.LinkedList;

public class test95 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Java");
        list.add("Python");
        list.addFirst("C++");
        list.addLast("JavaScript");
        list.remove("Python");
        list.add(2, "Go");

        System.out.println(list);
    }

}
// OUTPUT: [C++, Java, Go, JavaScript]


/*
 * Answer and Explanation:

add("Java") → [Java]
add("Python") → [Java, Python]
addFirst("C++") → [C++, Java, Python]
addLast("JavaScript") → [C++, Java, Python, JavaScript]
remove("Python") → [C++, Java, JavaScript]
add(2, "Go") → inserts "Go" at index 2 → [C++, Java, Go, JavaScript]
So the final list is: [C++, Java, Go, JavaScript].
*/