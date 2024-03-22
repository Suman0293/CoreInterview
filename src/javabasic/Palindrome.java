package javabasic;

public class Palindrome {
    public static void main(String[] args) {
        int a = 575;
        int n = a;
        int r = 0;
        int sum = 0;

        while (n > 0) {
            r = n % 10;
            sum = sum * 10 + r;
            n = n / 10;
        }
        if (a == sum) {
            System.out.println("The no. is palindrom");
        } else {
            System.out.println("The no. is not palindrom");
        }
    }
}
