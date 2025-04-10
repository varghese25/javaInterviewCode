public class test50 {
    public static void main(String args[]) {
        int a = 5;
        int b = 10;
        System.out.println(a++ * --b);
    }

}
/*
 * Answer and Explanation:
 * 
 * a = 5, b = 10
 * 
 * a++ (Post-increment): Uses a as 5, then increments it to 6.
 * 
 * --b (Pre-decrement): Decrements b to 9, then uses it.
 * 
 * Expression: 5 * 9 = 45.
 */