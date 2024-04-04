package javabasic;

public class ReverseDigit {

    public static void main(String[] args) {
        int a = 126;
        int b;
        int sum = 0;

        while (a > 0) {
            b = a % 10;
            sum = sum * 10 + b;
            a = a / 10;
        }

        System.out.println(sum);
    }

}
