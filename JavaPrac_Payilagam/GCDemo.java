public class GCDemo {

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Garbage collected!");
    }

    public static void main(String[] args) throws InterruptedException {
        GCDemo obj1 = new GCDemo(); // step 1
        GCDemo obj2 = new GCDemo(); // step 2

        obj1 = null; // step 3
        obj2 = null; // step 4
        // At this point, both obj1 and obj2 are eligible for garbage collection

        System.gc(); // Step 5 Suggest GC
        Thread.sleep(1000); // Step 6 Pause the main thread to allow GC to happen

        System.out.println("End of program"); // step 7
        // The finalize method will be called by the garbage collector when it collects
        // the object
    }
}
// Output may vary, but it should print "Garbage collected!" when the objects
// are collected and "End of program" at the end.