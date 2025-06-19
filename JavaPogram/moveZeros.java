
public class moveZeros {
    public static void main(String[] args) {
        int[] arr = { 0, 1, 0, 3, 12 };
        int n = arr.length;
        int index = 0; // Position for next non-zero

        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[index++] = arr[i]; // Move non-zero to the front
            }

        }
        // Fill the rest with zeros
        while (index < n) {
            arr[index++] = 0;
        }

        // print result
        System.out.println("Array after moving zeros: ");
        for (int num : arr) {
            System.out.println(num + " ");
        }

    }
}
