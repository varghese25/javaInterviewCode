public class test61 {

    public static void main(String args[]) {
        int x,
                y = 1;
        x = 10;
        if (x != 10 && x / 0 == 0)
            System.out.println(y);
        else
            System.out.println(++y);
    }

}

/*
 * In the if condition:
 * 
 * if (x != 10 && x / 0 == 0)
 * 
 * x != 10 is false because x = 10.
 * Since it's an AND (&&) condition, Java short-circuits the evaluation — it
 * doesn’t check x / 0 == 0 because the first condition is already false. (Refer
 * The Truth Table for AND operator)
 * So, no division by zero occurs, and the program executes the else block:
 * 
 * System.out.println(++y); // y = 1, so ++y = 2
 */