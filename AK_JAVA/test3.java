// static constructor example in Java
/*
 * How to Recognize a Constructor?
 * 1. Same name as the class: PageVisitors
 * 2. No return type (not even void)
 * 3. It’s automatically called when you create an object:
 * 
 */// PageVisitors ob1 = new PageVisitors();

class PageVisitors {
    static int count = 0;

    PageVisitors() { /*
                      * This line is the constructor. In Java, a constructor is a special method with
                      * no return type (not even void) and has the same name as the class.
                      */
        count++;
    }

    void show() {
        System.out.println(count);
    }
}

class test3 {
    public static void main(String[] args) {
        PageVisitors ob1 = new PageVisitors(); // constructor runs here
        PageVisitors ob2 = new PageVisitors();
        PageVisitors ob3 = new PageVisitors();
        PageVisitors ob4 = new PageVisitors();
        PageVisitors ob5 = new PageVisitors();

        ob5.show();// prints static variable 'count'
    }
}
