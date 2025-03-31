public class test51 {
    public static void main(String args[]) {
        String str = "Java";
        str.concat("Programming");
        System.out.println(str);
    }

}
/*
 * OutPut is : Java
 * 
 * Answer and Explanation:
 * 
 * In Java, String objects are immutable, meaning their values cannot be changed
 * once created.
 * 
 * str.concat("Programming"); creates a new string "JavaProgramming" but does
 * not modify str.
 * 
 * Since str remains unchanged, System.out.println(str); prints "Java" instead
 * of "JavaProgramming".
 */