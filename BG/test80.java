class Robot {
    void action() {
        System.out.println("Robot performs basic task");
    }
}

class Android extends Robot {
    void action() {
        System.out.println("Android performs smart task");
    }
}

public class test80 {
    public static void main(String[] args) {
        Robot r = new Android();
        r.action();
    }

}
/*
 * Answer and Explanation:
 * 
 * Robot r = new Android(); — This is upcasting: a Robot reference points to an
 * Android object.
 * r.action(); — This calls the overridden method in the Android class,
 */