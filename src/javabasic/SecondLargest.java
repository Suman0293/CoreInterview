package javabasic;

public class SecondLargest {

    public static void main(String[] args) {
        int[] a = {1,5,8,9,12,15};
        int b = a[0];
        int c = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] > b) {
                c = b;
                b = a[i];
            } else if (a[i] > c && a[i] < b) {
                c = a[i];
            }
        }
        System.out.println(c);
    }
}
