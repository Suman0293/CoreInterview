package oops.shape;

import org.w3c.dom.ls.LSOutput;

public class BusinessMan implements RichMan, SocialWorker {

    int i = 1000;
    public void helpToOthers() {
        System.out.println("Helping Amount = " + i);
    }
    int j = 2000;
    public void donation() {
        System.out.println("Donation Amount = " + j);
    }
    int k = 3000;
    public void party() {

        System.out.println("Party Amount = " + k);
    }
    int l = 4000;
    public void earnMoney() {
        System.out.println("EarnMoney Amount = " + l);
    }
}
