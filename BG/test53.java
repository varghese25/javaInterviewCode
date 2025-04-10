public class test53 {

    public static void main(String[] args) {
        int x = 15;
        if (x <= 15) {
            System.out.print("Inside if ");
        } else if (x == 15) {
            System.out.print("Inside else if ");
        }
        System.out.println(x);
    }

    
}
/*
 * Answer and Explanation:
 * 
 * 1. The variable x is assigned a value of 15.
 * 2. The if condition checks if(x <= 15), which is true since x is 15.
 * 3. Therefore, "Inside if " is printed.
 * 4. The else if(x == 15) condition is not checked because the first if block
 * was already executed.
 * 5. System.out.println(x); prints 15 on the same line.
 */ 
