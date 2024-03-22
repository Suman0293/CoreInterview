package javabasic;

public class Armstrong {

    public static void main(String[] args) {
        int a = 158;
        int n = a;
        int sum = 0;
        int r;

        while (n > 0) {
            r = n % 10;
            sum = sum + (r * r * r);
            n = n / 10;
        }
        if (a == sum) {
            System.out.println("No. is Armstrong");
        } else {
            System.out.println("No. is Not Armstrong");
        }
    }

}
