public class Prac3 {
    public static void main(String[] args) {
        String s1 = ("Varghese");
        String s2 = new String("Varghese");
        System.out.println(s1 == s2); // false, because s1 and s2 are different objects in memory

    }

}


/*
 * s1 = "Varghese" → this goes into the String Constant Pool (SCP).
 * s2 = new String("Varghese") → this forces a new String object in heap memory,
 * even though "Varghese" is already in the pool.
 * 
 * The == operator compares object references, not contents.
 * 
 * s1 → reference to pooled string
 * 
 * s2 → reference to a different heap string
 * 
 * So, s1 == s2 is false because they point to different objects in memory.
 */