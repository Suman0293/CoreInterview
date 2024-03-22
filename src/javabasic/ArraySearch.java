package javabasic;

public class ArraySearch {
    public static void main(String[] args) {
        int[] a = {2, 9, 19, 5, 23, 8};
        int n = 5;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == n) {
                System.out.println(i);
            } else {
                System.out.println("-1");
            }
        }
    }

}
