import java.util.HashMap;
import java.util.Map;

public class test89 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Robo", 1);
        map.put("Chitti", 2);
        map.put("2.0", 3);
        map.put(null, 4);
        map.put("Chitti", 5);
        map.put(null, 6);

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }

}
