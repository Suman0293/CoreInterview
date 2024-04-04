package javabasic;

public class RandomNo {
    public static void main(String[] args) {
        int num = 0;
        for (int i = 0; i < 5; i++) {
            num = (int) (Math.random() * 100);
            System.out.println(num);
        }
    }
}
