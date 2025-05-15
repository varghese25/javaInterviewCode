public class test93 { // SprialLogic
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            for (int j = i; j <= 5; j++) {
                if ((i + j) % 2 == 0) {
                    sum += i * j;
                }
            }
        }
        System.out.println("Final Sum: " + sum);
    }
}
