public class crack19 {
    static <T> T identity(T t) {
        return t;
    }

    public static void main(String[] args) {
        Number n = identity(10);
        String s = identity("Hello");
        System.out.println(n);
        System.out.println(s);
        System.out.println(n instanceof Integer);
        System.out.println(s instanceof String);

    }
}

/*
 * identity(T t) returns the exact same object it receives as input.
 * 
 * Example:
 * 
 * identity(10) → returns 10
 * 
 * identity("hello") → returns "hello"
 * 
 * 
 * 
 * Step-by-step Execution:
 * 
 * 
 * 
 * 1. identity(10) is called:
 * 
 * 10 is an int, but in Java it gets autoboxed to Integer.
 * 
 * So, the generic type T becomes Integer, and it returns an Integer.
 * 
 * 
 * 
 * 2. Then it’s assigned to a variable n of type Number:
 * 
 * Since Integer is a subclass of Number, this is allowed:
 * 
 * Number n = new Integer(10);
 * 
 * 
 * 
 * 3. n instanceof Integer checks:
 * 
 * Whether the actual object n refers to is an instance of Integer.
 * 
 * 
 * 
 * 4. So this will print:
 * 
 * true
 * 
 * 
 */