import java.util.List;
import java.util.stream.Collectors;

public class testThirteen {
    
 public static void main(String[] args) {
In 
 List<String> words = List.of("Hi", "Java");

 List<Character> result = words.stream()
 .gather((word, downstream) -> {
 for (char c : word.toCharArray()) {
 downstream.accept(c);
 }
 })
 .toList();

 System.out.println(result);
 }
}
