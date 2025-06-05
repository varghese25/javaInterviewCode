import java.util.ArrayList;
import java.util.List;

public class crack15 {
    public static void main(String[] args) {
        List<?> list = new ArrayList<String>(); // Wild Card used here is Question. Here i dint not mention
                                                // list<String_>
        list.add(null); // null is allowed. if its string it wont compile
    }

} /*
   * A. Compiles
   * B. Compilation error
   * C. Runtime error
   * D. Compiles but crashes at runtime
   * E. Other?
   * 
   * Correct Answer: A. Compiles
   */

/*
 * Explanation:
 * Key Points:
 * List<?> means a list of unknown type. It’s a wildcard — we don’t know what
 * type it holds.
 * 
 * With ?, you cannot add anything to the list, because the compiler doesn’t
 * know what type is safe to insert.
 * 
 * ✅ Exception: You can add null, because null is a valid value for any
 * reference type.
 * 
 * 📌 So why does this compile?
 * list.add("abc") ❌ Not allowed — compiler error (type is unknown).
 * 
 * list.add(null) ✅ Allowed — null is safe regardless of the generic type.
 * 
 */