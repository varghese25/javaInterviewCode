class thread1 extends Thread {
    // initiated run method for Thread
    public void run() {
        String str = "Thread Started Running...";
        System.out.println(str);
    }

    public static void main(String[] args) {
        thread1 t = new thread1();
        t.start();
    }
}