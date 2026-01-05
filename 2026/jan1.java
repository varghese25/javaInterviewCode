
import java.util.*;

public class jan1 {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        
      
        list.add(2);
        list.add(1);
        list.add(0);
        list.remove(list.indexOf(0));

        System.out.println(list);
    }
}
