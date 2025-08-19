class tiju {

    private int x = 1; // instance variable (belongs to the object)
    void set(int x) { // parameter x (local variable)
        x = x; // assigns parameter to itself, does NOT affect instance variable
        // this.x = x; // this.x refers to the instance variable
    }

    void print() {
        System.out.println(x);
    }

    public static void main(String[] args) {
        tiju a = new tiju();
        a.set(42); // a is object of tiju, but the method set does not change the instance variable x
        a.print();
    }
    
}

/*
 * Two different x exist here:
 * 
 * private int x → instance variable, belongs to the object. Initialized as 1.
 * 
 * int x → method parameter, local to set().
 * 
 * When you write x = x; → it only changes the local parameter, not the instance
 * variable.
 * 
 * So the object’s x remains 1.
 * outPut as 42 this.x=x
 * this.x = object’s x → now it changes the instance variable.
 * Calling set(42) will update the object’s x to 42.
 * Then print() will output 42.
 * 
 */
