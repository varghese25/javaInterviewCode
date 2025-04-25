class Account {
    private int balance = 1000;

    private int getBalance() {
        return balance;
    }

    public int accessBalance(boolean allow) {
        if (allow) {
            return getBalance();
        } else {
            return -1;
        }
    }
}

public class test74 {

    public static void main(String[] args) {
        Account acc = new Account();
        System.out.println(acc.accessBalance(false));
    }
}
