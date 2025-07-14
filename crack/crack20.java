@FunctionalInterface
interface Processor {
    void process();
}

class Printer {
    void print() {
        System.out.println("Instance print");
    }

    static void staticPrint() {
        System.out.println("Static print");
    }

    void printWithArg() {
        System.out.println("Print with arg");
    }
}

public class crack20 {
    public static void main(String[] args) {
        Processor p1 = new Printer()::print; // Line A
        Processor p2 = Printer::staticPrint; // Line B
        // The following line is invalid because printWithArg requires an argument, so it cannot be used as a Processor
        // Processor p3 = new Printer()::printWithArg; // Line C

        p1.process();
        p2.process();
        // p3.process(); // This would not compile
    }
}
