public class testNine {

    int x = 10;

    public static void main(String[] args) {

        testNine t = new testNine();
        System.out.println(t.x);

    }

    static {
        int x = 20;
        System.out.println(x);
    }

}

/*
  Static block executes first, prints 20.
 
  Main method runs, prints instance variable x = 10.
 */