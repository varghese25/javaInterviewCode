public class crackAry13 {
    var field = "hello"; // Line 1

    public void method() {

        var x = 10; // Line 2
        var y; // Line 3
        var z = null; // Line 4
        var list = new ArrayList<>();

    }
}
// Answer: Complaniton Error at Line 1, 3, 4
// Explanation:
// Line 1: 'var' cannot be used for class fields in Java var field = "hello";.
// Line 3: ''var' cannot be used without initialization in Java var y;.
// Line 4: 'var' cannot be used with null initialization in Java var z = null;