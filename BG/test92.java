public class test92 { // loop twist
    public static void main(String[] args) {
        int i = 0;
        while (i < 5) {
            if (i++ == 2) {
                continue;
            }
            System.out.print(i + " ");
        }
    }
}
/**
 * | Iteration | i before `if` | Condition `i++ == 2` | i after `i++` |
 * `continue`? | Printed |
 * | --------- | ------------- | -------------------- | ------------- |
 * ----------- | ------- |
 * | 1 | 0 | `0 == 2` → ❌ | 1 | No | `1` |
 * | 2 | 1 | `1 == 2` → ❌ | 2 | No | `2` |
 * | 3 | 2 | `2 == 2` → ✅ | 3 | Yes | - |
 * | 4 | 3 | `3 == 2` → ❌ | 4 | No | `4` |
 * | 5 | 4 | `4 == 2` → ❌ | 5 | No | `5` |
 * 
 */