public class crack8 {
 private static boolean running = true;

 public static void main(String[] args) {
 new Thread(() -> {
 while (running) {}
 System.out.println("Stopped");
 }).start(); // closing curly bracket are missing

 // Even if the closing curly brackets are properly placed, the main method starts a new thread that enters an infinite loop because the running variable is set to true and never changes. As a result, the loop does not terminate, and the statement System.out.println("Stopped"); is never executed. Therefore, the program produces no output and continues running indefinitely.