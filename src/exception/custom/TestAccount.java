package exception.custom;

public class TestAccount {

    public static void main(String[] args) {

        Account a = new Account();
        a.deposit(4000);
        try {
            a.withdrawl(2000);
        }
        catch (InsufficientFundBalance e) {
            System.out.println(e);

        }

    }

}
