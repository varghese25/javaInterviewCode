public class test4 {
    public static void main(String[] args) {

        System.out.println(1 + 2 + "3" + 4 + 5);
    }

}
/*
 * Explanation:-
 * 1. Operator precedence
 * + in Java is addition for numbers and concatenation for strings.
 * Java evaluates left to right.
 * 
 * 2. Start with 1 + 2 = 3; Both are integers -> addition.
 * 
 * 3. Next: 3 + "3" , 3 is an integer, "3" is a string -> Java converts 3 to a
 * string and concatenates. Result: "33"(a string)
 * 
 * 4. Next: "33" + 4, "33" is a string, 4 is an integer -> string concatenation
 * Result: "334"
 * 
 * 5. Finally: "334" + 5, "334" is a string, 5 is an integer ->string
 * concatenation Result: "3345"
 * 
 * Once Java encounters a string in a + operation, all subsequent + operations
 * are treated as string concatenation. That’s why the last numbers are appended
 * as strings rather than added numerically.
 */