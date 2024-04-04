package javabasic;

public class Palindrome {
     public static void main(String[] args) {
        int a = 575;
        int b = a;
        int sum = 0;
        int c;


        while (b > 0) {
            c = b % 10;
            sum = sum * 10 + c;
            b = b / 10;
        }
        if (a == sum) {
            System.out.println("The no. is palindrom");
        } else {
            System.out.println("The no. is not palindrom");
        }
    }
}
