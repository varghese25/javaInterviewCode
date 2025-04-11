//  public class crack9 {
//     public static void main(String[] args) {
//         final StringBuilder sb = new StringBuilder("abc");
//         sb.append("xyz");
//         System.out.println(sb.toString());
//     }
// }

import java.util.Optional;

public class crack9 {

    public static void main(String[] args) {

        Optional<String> opt = Optional.empty();

        if (opt != null) {
            System.out.println("It's not null!");
        }
    }
}