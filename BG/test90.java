public class test90 {

    public static void main(String[] args) {
        int i = 0;
        for (System.out.print("Start "); i < 3; System.out.print("End ")) {
            i++;
            System.out.print(i + " ");
        }
    }

}
/*
 * 
 * Answer and Explanation:
 * 
 * System.out.print("Start ") executes before the loop starts.
 * 
 * Then in each iteration:
 * i++ increments i.
 * System.out.print(i + " ") prints the incremented value.
 * System.out.print("End ") runs after each loop body (as part of the update
 * expression).
 * 
 * Step-by-step output:
 * Before loop: Start
 * 
 * 1st iteration: i = 1 → print 1, then End
 * 
 * 2nd: i = 2 → print 2, then End
 * 
 * 3rd: i = 3 → print 3, then End
 * 
 * Loop stops as i = 3
 */