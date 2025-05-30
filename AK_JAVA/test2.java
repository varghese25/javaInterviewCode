public class test2 {
    public static void main(String[] args) {
        int a = 10;
        int b = ++a; // Pre-increment: a is incremented first, then assigned to b
        System.out.println(a);
        System.out.println(b);
    }

}
/*
 * int a = 10; → a is initialized with value 10
 * 
 * int b = ++a; → ++a is pre-increment, so:
 * 
 * a is incremented first (a becomes 11)
 * 
 * Then the value of a (now 11) is assigned to b
 * 
 * a = 11
 * 
 * b = 11
 * 
 * Initially a = 10, after ++a, both a and b become 11
 */