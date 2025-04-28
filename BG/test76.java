class Parent {
    int num = 100;
}

class Child extends Parent {
    int num = 200;
}

public class test76 {
    public static void main(String[] args) {
        Parent obj = new Child();
        System.out.println(obj.num);
    }
    
}

/*
 *
 * Answer and Explanation:
 * Variables are not overridden in Java (only methods are overridden).
 * 
 * Parent obj = new Child(); — reference type is Parent.
 * 
 * So obj.num accesses the Parent’s num → 100 is printed.
 */