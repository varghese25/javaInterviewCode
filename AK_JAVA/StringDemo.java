class StringDemo {
    public static void main(String[] args) {
        String name1 = new String("arbaz khan");
        String name2 = "arbaz khan";

        if (name1 == name2) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
} // Output: false

/*
 * Explanation
 * 
 * 1) String name1 = new String("arbaz khan");
 * 
 * creates a new String object in heap memory; Even though "arbaz khan" is a
 * string literal stored in the String Pool, the new keyword tells Java:
 * “I want a new object in heap, not the one in the pool.”
 * 
 * 2) String name2 = "arbaz khan";
 * 
 * String literals are stored in the String Pool (inside the JVM method area).
 * 
 * If the literal "arbaz khan" already exists in the pool, Java reuses it
 * instead of creating a new object.
 * 
 * 3) The == Operator
 * compares references (memory addresses), not the content of objects
 * 
 * name1 -> reference to a new object in heap.
 * name2 -> reference to the string pool object.
 */
