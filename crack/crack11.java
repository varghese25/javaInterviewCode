    class A {
    static final int VALUE = 42;
    static {
        System.out.println("A loaded");
    }
}

public class crack11 {
    public static void main(String[] args) {
        System.out.println(A.VALUE);
    }
}