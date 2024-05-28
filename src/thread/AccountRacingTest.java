package thread;

public class AccountRacingTest {
    public static void main(String[] args) {
        AccountRacing r = new AccountRacing("Suman");
        AccountRacing r1 = new AccountRacing("Palak");
        //AccountRacing r2 = new AccountRacing("smn");

        r.start();
        r1.start();
       // r2.start();
    }
}