import java.util.*;

public class test99 { // TreeSet
    public static void main(String[] args) {
        Set<String> set = new TreeSet<>(Collections.reverseOrder());
        set.add("Banana");
        set.add("Apple");
        set.add("Mango");
        set.add("Apple");
        System.out.println(set);
    }
}
// OUTPUT: [banana, apple, mango]

/*
 * Answer and Explanation:
 * 
 * TreeSet sorts elements by natural order unless a custom comparator is given.
 * 
 * Here, Collections.reverseOrder() sorts in descending alphabetical order.
 * 
 * Duplicate "Apple" is ignored (no duplicates in Set).
 * 
 * Final sorted order: Mango, Banana, Apple.
 * 
 * So, output is:
 * [Mango, Banana, Apple]
 * 
 * -------------------------------
 * TreeSet:
 * 
 * stores unique elements in sorted order (natural order by default).
 * 
 * It does not allow duplicates.
 * 
 * 
 * 
 * Collections.reverseOrder():
 * 
 * changes the sorting to descending.TreeSet sort in descending order (Z -> A
 * instead of A -> Z).
 * 
 * The set will be printed in reverse alphabetical order // [Mango, Banana,
 * Apple]
 * 
 * Duplicate values like "Apple" are automatically ignored.
 * 
 */