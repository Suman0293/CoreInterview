package javabasic;

public class Factorial {

    public static void main(String[] args) {
        int n = 5;  //5*4*3*2*1
        int fact = 1;
        for (int i = 1; i <= 5; i++) {
            fact = fact * i;
        }
        System.out.println(fact);
    }

}
