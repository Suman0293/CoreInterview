package exception.test;

public class TestFinally {

    public static void main(String[] args) {

        try {
            int a = 10;

            int b = 2;

            System.out.println("**before**");

            int c = a / b;

            System.out.println("division = " + c);

        } catch (ArithmeticException e) {

            System.out.println(e);

            System.exit(0);

        } finally {
            System.out.println("finally block");
        }
    }
}
