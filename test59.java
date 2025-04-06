public class test59 {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "he" + "llo";
        System.out.println(s1 == s2);//

    }

}
/*
 * In Java, string literals that are concatenated at compile time are interned,
 * meaning they are stored in the same memory location. Therefore, the two
 * string literals "hello" and "he" + "llo" refer to the same object in memory.
 * As a result, the comparison using == returns true.
 */
