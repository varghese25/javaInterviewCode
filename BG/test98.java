import java.util.HashMap;
import java.util.Map;

public class test98 {
    public static void main(String[] args) {
        Map<String, Integer> scores = new HashMap<>();
        scores.put("Rohit", 100);
        scores.put("Virat", 85);
        scores.put("Rohit", 120);
        scores.put(null, 50);
        scores.put(null, 75);
        System.out.println(scores);
    }

}

/*
 * 2. {null=75, Rohit=120, Virat=85}
 * 
 * 
 * 
 * 
 * 
 * HashMap behavior:
 * 
 * 1) Keys are unique: If you add a key that already exists, its value gets
 * overwritten. scores.put("Rohit", 100); -> scores.put("Rohit", 120);
 * 
 * Overwrites the value of "Rohit" from 100 to 120.
 * 
 * 
 * 
 * 2) Allows one null key: You can have only one null key in a HashMap
 * 
 * scores.put(null, 50); -> scores.put(null, 75);
 * 
 * Overwrites the previous null key’s value 50 to 75.
 * 
 * 
 * 
 * 
 * 
 * Order may differ since HashMap does not guarantee order.
 * 
 * {null=75, Rohit=120, Virat=85}
 */