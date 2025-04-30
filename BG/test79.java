class College {
    void display() {
        System.out.println("Welcome to ABC College");
    }
}

class Student extends College {
    void display() {
        System.out.println("Hello from Student class");
    }
}


public class test79 {

    public static void main(String[] args) {
        College obj = new Student();
        obj.display();
    }
    
}
