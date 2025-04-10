import java.util.function.Function;
public class crack5 {

    public static void main(String[] args) {
        Function<Integer, Integer> square = x -> {
            if (x < 0)
                return -x * x;
        };
        System.out.println(square.apply(-5));
    }

}
/*
-5 < 0
5 * -5*/ 