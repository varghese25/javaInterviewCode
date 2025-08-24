public class prac1 {
    public static void main(String[] args) {
        int x = 3;
        int y = ++x * 5 / x-- + --x;
        System.out.println(y);

    }
}
/*
 * Step 1: Initial value
 * x = 3
 * 
 * Step 2: Evaluate ++x
 * 
 * ++x means pre-increment → increase x first, then use it.
 * 
 * x was 3, now becomes 4.
 * 
 * So ++x = 4.
 * 
 * Expression becomes:
 * 
 * y = 4 * 5 / x-- + --x
 * 
 * 
 * and x = 4.
 * 
 * Step 3: Evaluate 4 * 5
 * 4 * 5 = 20
 * 
 * 
 * So:
 * 
 * y = 20 / x-- + --x
 * 
 * 
 * and x = 4.
 * 
 * Step 4: Evaluate x--
 * 
 * x-- means post-decrement → use current value, then decrease it.
 * 
 * Current x = 4, so x-- = 4, then x = 3.
 * 
 * Now:
 * 
 * y = 20 / 4 + --x
 * 
 * Step 5: Evaluate 20 / 4
 * 20 / 4 = 5
 * 
 * 
 * So:
 * 
 * y = 5 + --x
 * 
 * 
 * and x = 3.
 * 
 * Step 6: Evaluate --x
 * 
 * --x is pre-decrement → decrease first, then use.
 * 
 * x = 3 → 2
 * 
 * So --x = 2.
 * 
 * Now:
 * 
 * y = 5 + 2
 * 
 * Step 7: Final Result
 * y = 7
 * 
 * 
 * ✅ Output:
 * 
 * 7
 */