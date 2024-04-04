package javabasic;

public class BubbleSort {
    public static void main(String[] args) {

        int[] a = {10, 20, 8, 50, 1, 2, 3, 4, 5, 15, 35};
        int b ;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {

                if (a[i] > a[j]) {
                    b = a[j];
                    a[j] = a[i];
                    a[i] = b;
                }
            }
            System.out.print(a[i] + " ");

        }

    }
}
