package thread;


public class Account {

    private int balance;

    public int getBalance() {
        delay();
        return balance;
    }

    public void setBalance(int balance) {
        delay();
        this.balance = balance;
    }

    public void deposit(String msg, int amt) {

        synchronized (this) {

            int bal = getBalance() + amt;
            setBalance(bal);

            System.out.println(msg + " -> new balance = " + bal);
        }
    }

    public void delay() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
