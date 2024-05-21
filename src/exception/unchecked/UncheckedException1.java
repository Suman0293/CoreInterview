package exception.unchecked;

public class UncheckedException1 {
    public static void main(String[] args) {
        int i = 10;
        if (i != 10) {
            System.out.println("i 10 nhi h");
        } else {
            RuntimeException r = new RuntimeException();
            throw r;
        }
    }
}
