package oops;

public class BusinessMan implements Richman {
    public int amount = 2000;

    @Override
    public void donation(int i) {
        System.out.println("Total amount of Businessman" + "=" + amount);
        System.out.println("Total donations of Businessman" + "=" + i);
        int a = amount - i;
        System.out.println("Remaining amount of Businessman" + "=" + a);
    }
}
