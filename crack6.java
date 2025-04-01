public class crack6 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java");
        change(sb);
        System.out.println(sb);
    }

    static void change(StringBuilder sb) {
        sb.append("Python");
    }

}
