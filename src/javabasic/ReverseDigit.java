package javabasic;

public class ReverseDigit {

    public static void main(String[] args) {
        int n=126;
        int r;
        int x=n;
        int s = 0;
        while(n>0) {
            r=n%10;
            s =s*10+r;
            n=n/10;
        }

        System.out.println(s);
    }

}
