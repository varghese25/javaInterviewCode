public class test78 {
    public static void main(String[] args) {
        int a = 10, b = 20;
        System.out.println(a++ + ++b);
    }
}

/*
 * Step-by-step Explanation:
 * a = 10
 * 
 * b = 20
 * 
 * Expression:
 * 
 * java
 * Copy
 * Edit
 * a++ + ++b
 * This involves:
 * 
 * a++ → post-increment
 * 
 * Means first use a, then increment it.
 * 
 * ++b → pre-increment
 * 
 * Means first increment b, then use it.
 * 
 * Now evaluating:
 * a++ →
 * 
 * Use current a = 10.
 * 
 * After the expression, a will become 11.
 * 
 * ++b →
 * 
 * First, increment b from 20 to 21.
 * 
 * Then use 21.
 * 
 * So calculation:
 * 
 * csharp
 * Copy
 * Edit
 * 10 (from a++) + 21 (from ++b) = 31
 * After this line:
 * 
 * a = 11
 * 
 * b = 21
 * 
 * 🔵 Final Output:
 * Copy
 * Edit
 * 31
 */