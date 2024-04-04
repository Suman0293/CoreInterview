package javabasic;

public class ArraySearch {
    public static void main(String[] args) {
        int[] a = {1, 2, 29, 9, 19, 5, 23};
        int n = 9;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == n) {
                System.out.println(i);
            } else {
                System.out.println("-1");
            }
        }
    }

}
