import java.util.ArrayList;
import java.util.List;

class MyList extends ArrayList<String> {
    public boolean add(String s) {
        super.add(s + "1"); 
        return true; 
    }
}

public class crackAry14 {
    public static void main(String[] args) {
        List<String> list = new MyList();
        list.add("A"); //
        list.add("B"); // 
        System.out.println(list);
    }

}
