package oops;

public class TestRichman {
    public static void main(String[] args) {
        Richman[] r = new Richman[2];
        r[0] = new BusinessMan();
        r[1] = new Student();

        r[0].donation(1000);
        r[1].donation(500);
    }
}
