public class SwapNumbers {
    public static void main(String[] args) {
        int a = 5, b = 10;

        a = a + b; // 5 + 10 a = 15
        b = a - b; // 15 - 10 b = 5
        a = a - b; // 15 - 5 a = 10;

        System.out.println("After Swapping: a = " + a + ", b = " + b);
        // a =10 , b = 5
    }
}
