package exception.custom;

public class Account {
    public int balance = 0;
    public int getBalance() {

        return balance;
    }
    public void setBalance(int balance) {

        this.balance = balance;
    }

    public void deposit(int amount) {
        int total = getBalance() + amount;
        setBalance(total);
        System.out.println("Balance after deposit = " + getBalance());
    }

    public void withdrawl(int amount) throws InsufficientFundBalance {
        int total = getBalance() - amount;
        if (total > 2000) {
            setBalance(total);
            System.out.println("Balance after withdrawl = " + getBalance());

        } else {
            InsufficientFundBalance e = new InsufficientFundBalance();
            throw e;
        }
    }

}

