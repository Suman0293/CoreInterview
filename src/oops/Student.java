package oops;

public class Student implements  Richman{

    public  int amount = 1000;

    @Override
    public void donation(int i) {
        System.out.println("Total amount of Student" + "=" + amount);
        System.out.println("Total donations of Student" + "=" + i);
        int a = amount - i;
        System.out.println("Remaining amount of Student" + "=" + a);
    }
}
