class Parent {
    int num = 50;

    void show() {
        System.out.println("Parent's show(), num = " + num);
    }
}

class Child extends Parent {
    int num = 100;

    void show() {
        System.out.println("Child's show(), num = " + num);
    }
}

public class test77 {
    public static void main(String[] args) {
        Parent obj = new Child();
        obj.show();
        System.out.println(obj.num);
    }

}
