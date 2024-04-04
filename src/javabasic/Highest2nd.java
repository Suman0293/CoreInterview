package javabasic;

public class Highest2nd {

    public static void main(String[] args) {
        int[] a = {30, 20, 10, 50, 60};
        int b = 0;
        int c = 0;

        for (int i = 0; i < a.length; i++) {
            if (b < a[i]) {
                c = b;
                b = a[i];
            }
            if (c < a[i] && b > a[i]) {
                c = a[i];
            }

        }
        System.out.println(c);
    }
}
