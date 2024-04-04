package javabasic;

public class Armstrong {
    public static void main(String[] args) {
        int a = 153;
        int b = a;
        int sum = 0;
        int c;

        while (b > 0) {
            c = b % 10;
            System.out.println("c = " + c);
            sum = sum + (c * c * c);
            System.out.println("sum = " + sum);
            b = b / 10;
            System.out.println("b = " + b);

        }
        if (a == sum) {
            System.out.println("No. is Armstrong");
        } else {
            System.out.println("No. is Not Armstrong");
        }
    }

}
