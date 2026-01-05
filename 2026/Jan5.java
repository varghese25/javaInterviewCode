
public class Jan5 { // Captial letter Jan5
    public static void main(String[] args) {

        int[] arr = { 2, 1, 0 };
        for (int i : arr) {
            System.out.println(arr[i]);

        }
    }
}



/*
 * Explanation.
 * 
 * The array arr has three elements: arr[0] = 2, arr[1] = 1, arr[2] = 0.
 * 
 * The for-each loop iterates over each element in the array:
 * 
 * 1. In the first iteration, i = 2. So, arr[i] = arr[2] = 0. It prints 0.
 * 
 * 2. In the second iteration, i = 1. So, arr[i] = arr[1] = 1. It prints 1.
 * 
 * 3. In the third iteration, i = 0. So, arr[i] = arr[0] = 2. It prints 2.
 * 
 * Therefore, the output will be:
 * 
 * 0
 * 
 * 1
 * 
 * 2
 * 
 */