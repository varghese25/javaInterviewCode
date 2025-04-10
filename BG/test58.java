public class test58 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        System.out.println(arr[2]);
    }

}
/*
 * Because you created an int array without assigning specific values to its
 * elements, Java automatically filled them with the default value for integers,
 * which is 0. Therefore, when you access the element at index 2, you retrieve
 * this default value
 */