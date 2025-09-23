import java.util.stream.*;

public class Prac4 {
    public static void main(String[] args) {
        Stream.of("A", "B", "C", "D")
                .peek(System.out::print)
                .anyMatch(s -> s.equals("C"));
    }

}

/*
 * 1. Stream.of("A", "B", "C", "D")
 * 
 * This creates a stream of elements: "A", "B", "C", "D".
 * 
 * Think of a Stream as a pipeline that processes data element by element.
 * 
 * So now we have a stream like:
 * ["A", "B", "C", "D"]
 * 
 * 2. .peek(System.out::print)
 * 
 * peek is an intermediate operation.
 * 
 * It allows you to "look at" each element as it flows through the pipeline
 * without changing it.
 * 
 * Here, it prints each element (System.out::print).
 * 
 * So when the stream runs, "ABCD" will be printed as elements flow through.
 * 
 * 3. .anyMatch(s -> s.equals("C"))
 * 
 * anyMatch is a terminal operation (it ends the stream).
 * 
 * It checks if any element in the stream matches the given condition.
 * 
 * The condition here is s.equals("C").
 * 
 * Once it finds "C", it stops and returns true.
 * 
 * So the evaluation goes like this:
 * 
 * Takes "A" → prints "A" → checks "A".equals("C") → false → continue.
 * 
 * Takes "B" → prints "B" → checks "B".equals("C") → false → continue.
 * 
 * Takes "C" → prints "C" → checks "C".equals("C") → true → stop here.
 * 
 * It won’t even process "D", because anyMatch short-circuits once a match is
 * found.
 * 
 * 
 * x -> System.out.print(x) (lambda form)
 * 
 * is equivalent to → System.out::print (method reference form)
 */ {

}
