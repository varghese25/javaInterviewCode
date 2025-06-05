import java.util.Map;
import java.util.TreeMap;

public class crack16 {
    public static void main(String[] args) {
        Map<Integer, String> map = new TreeMap<>();
        map.put(null, "nullKey");
        System.out.println(map.get(null));
    }

}
