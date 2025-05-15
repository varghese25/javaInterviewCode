public class test91 {

    public static void main(String[] args) {
        int x = 0;
        for (int i = 0; i < 5; i++) {
            if ((x++ % 2) == 0) {
                System.out.print(x + " ");
            }
        }
    }

}


/*
 * Answer and Explanation :
 * 
 * x++ % 2 uses the current value of x for modulus, then increments x.
 * 
 * If that result is even (== 0), then it prints the new value of x.
 * 
 * 
 * Iterations:
 * 
 * i=0: x=0, x++ % 2 = 0 → print 1
 * 
 * i=1: x=1, x++ % 2 = 1 → skip
 * 
 * i=2: x=2, x++ % 2 = 0 → print 3
 * 
 * i=3: x=3, x++ % 2 = 1 → skip
 * 
 * i=4: x=4, x++ % 2 = 0 → print 5
 */