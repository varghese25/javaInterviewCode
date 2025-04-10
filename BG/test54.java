public class test54 {
    public static void main(String args[]) {
        final int i;
        i = 10;
        System.out.println(i);
    }
    
}
/*
 * Answer and Explanation:
 * 
 * 1. The variable i is declared as final, meaning it can be assigned a value
 * only once.
 * 2. However, since i is not initialized at the time of declaration, it can
 * still be assigned a value once inside main().
 * 3. i = 10; is the first and only assignment, so the program compiles
 * successfully.
 * 4. System.out.println(i); prints 10.
 */ 
