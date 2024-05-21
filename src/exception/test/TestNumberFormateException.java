package exception.test;

public class TestNumberFormateException {

    public static void main(String[] args) {

        try {
            int a = 10;
            int b = 2;
            System.out.println("**before**");
            int c = a / b;
            System.out.println("division = " + c);

            String str = "12a";
            int number = Integer.parseInt(str);
            System.out.println("number = " + number);

        } catch (NumberFormatException e) {

            System.out.println(e);
            System.out.println("message = " + e.getMessage());
            //e.printStackTrace();

        } catch (ArithmeticException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("**after**");

    }

}
