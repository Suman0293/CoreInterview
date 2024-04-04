package javabasic;

public class   ArraySearchMethod {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6};
        int idx = 4;
        System.out.println("index = " + add(arr, idx));
    }

    private static int add(int[] a, int b) {
        int s = -1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == b) {
                s = i;
            }
        }
        return s;
    }
}

