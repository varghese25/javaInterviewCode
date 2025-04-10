public class testSix { 
 public static void change(int input[])
 { 
 input = new int[5]; 
 input[0] = 15; 
 } 

 public static void main(String args[])
 { 
 int arr[] = new int[5]; 
 change(arr); 
 System.out.println(arr[0]); 
 } 
}
    

/* Explnation 
 

Arrays are passed by reference in Java, meaning modifications inside the method affect the original array.

However, inside the change method, a new array (new int[5]) is created and assigned to input. This means:The reference input now points to a new array {15, 0, 0, 0, 0}.

The original array (arr in main) is not modified because input was reassigned to a new memory location.

After returning from change(), the reference arr in main still points to the original array {0, 0, 0, 0, 0}.

*/
