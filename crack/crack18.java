// import java.util.function.Predicate;

class crack18 {
    public static void main(String[] args) {
        int x = 5;
        Predicate<Integer> p = i -> i < x; // example: x is 5 and p = i is input value exmple if i give 3 it consider 3<
                                           // 5 so// output is true
        x = 10; // This line modifies x after it has been captured by the lambda expression
        // If you try to run this code, it will cause a compilation error because
        System.out.println(p.test(7));
    }
}
/*
 * Java lambda expressions can only capture variables that are effectively
 * final. That means once a variable is used inside a lambda, you cannot change
 * its value afterwards.
 * 
 * 
 * Predicate (One parameter, returns boolean)
 * 
 * Lambda expressions can only use variables that are final or effectively
 * final. Since you're modifying x after it's captured, it causes a compilation
 * error.
 * 
 * 1. int x = 5; → Declares and initializes x
 * 2. Predicate<Integer> p = i -> i < x; → Uses x inside the lambda. ( i is 7 in
 * putting value)
 * 3. But then, x = 10; → You change the value of x after using it inside the
 * lambda.
 * 
 * 
 * This violates the "effectively final" rule — because now x is not final or
 * effectively final.
 * 
 * If you want the code to compile, don't modify x after the lambda:
 * int x = 5;
 * Predicate<Integer> p = i -> i < x;
 * // x = 10; // remove this line
 * System.out.println(p.test(7)); // Output: false
 * 
 * Or use a final variable:
 * final int x = 10;
 * Predicate<Integer> p = i -> i < x;
 * System.out.println(p.test(7)); // Output: true
 * 
 */