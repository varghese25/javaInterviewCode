public class crack17 {

    public static void main(String[] args) {
        System.out.println(true ? null : "yes");;
// System.out.println(false ? null : "yes");
    }
}

// Output: null
/**
 * Explanation:
 * The ternary operator evaluates the condition before the question
 * mark. If the condition is true, it returns the first value (which is null in
 * this case); if false, it returns the second value ("yes"). Since the
 * condition is true, it returns null.
 */ 