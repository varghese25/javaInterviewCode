public class test62 {

    public static void main(String[] args) {
        int a = 5;
        int b = 2;
        System.out.println(a + b + " is the sum");
        System.out.println("The sum is " + a + b); /* ("The sum is " + (a + b)) if add parathesis ,Out put the sum 7 */
    }

}

/*
 * The output of the above code is:
 * 7 is the sum
 * The sum is 52
 * 
 * In the first print statement, a + b is evaluated first, and then the result
 * is concatenated with " is the sum".
 * In the second print statement, "The sum is " is concatenated with a (5), and
 * then with b (2), resulting in "The sum is 52".
 */
