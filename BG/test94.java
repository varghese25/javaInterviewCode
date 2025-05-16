public class test94 { // TrickyLoop
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <= 5; i++) {
            if (i % 2 == 0) {
                continue;
            }
            for (int j = 1; j <= 5; j++) {
                if (j % 2 == 0)
                    break;
                count++;
            }
        }
        System.out.println("Count is: " + count);
      }
     
    
}
// Count is: 3