package oops.shape;

public class TestRich {
    public static void main(String[] args) {
        RichMan rm = new BusinessMan();
        rm.donation();
        rm.party();
        rm.earnMoney();

        SocialWorker sw = new BusinessMan();
        sw.helpToOthers();
    }
}
