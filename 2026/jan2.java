
import java.util.HashMap;
import java.util.Map;

public class jan2 {
    public static void main(String[] args) {
        Map<Integer, String> m = new HashMap<>();
        m.put(1, "A");
        m.put(1, "B");
        System.out.print(m.get(1));

    }
}

/*
 * Explanation.
 * 
 * 
 * 
 * 
 * 
 * m.put(1, "B")overwrites"A"
 * 
 * m.get(1) returns "B"
 * 
 * 
 * 
 * OutPut B.
 * 
 * 
 * 
 * HashMap does not allow duplicate keys.
 */