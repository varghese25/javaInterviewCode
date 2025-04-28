class Encapsulate {
    private int data = 100;

    private int getData() {
        return data;
    }

    public int accessData(int key) {
        if (key == 1234)
            return getData();
        else
            return -data;
    }
}

public class test75 {
    public static void main(String[] args) {
        Encapsulate obj = new Encapsulate();
        System.out.println(obj.accessData(4321));
    }
}

// The code will print -100 because the key is incorrect and the method
// accessData returns -data.
// The method getData is private and cannot be accessed directly from outside
// the class. 
// OutPut is 100