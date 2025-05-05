interface Robot {
    void performTask();
}

class Android implements Robot {
    public void performTask() {
        System.out.println("Android is cleaning");
    }
}

public class test82 {

    public static void main(String[] args) {
        Robot r = new Android();
        r.performTask();
    }

}

/*
 * Answer and Explanation :
 * 
 * The Robot interface is implemented by the Android class.
 * 
 * A reference of type Robot is assigned an object of Android.
 * 
 * The performTask() method is overridden and called, so output is:
 * 
 * Android is cleaning
 */