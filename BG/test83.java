class Vaseekaran {
    void buildRobot() {
        System.out.println("Vaseekaran is building Chitti");
    }
}

class Chitti extends Vaseekaran {
    void buildRobot() {
        System.out.println("Chitti is upgrading himself");
    }

    void destroy() {
        System.out.println("Chitti is destroyed");
    }
}
public class test83 {

    public static void main(String[] args) {
        Vaseekaran v = new Chitti(); // // Dynamic method dispatch happens here
        v.buildRobot();
        // v.destroy(); // Line commented intentionally
    }
    
}

// explanation:
