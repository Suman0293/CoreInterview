package exception.multiple;

public class MultiExceptionInSingleCatch {

    public static void main(String[] args) {
        int i = 10;
        try {
            int j = i / 0;
        } catch (ArithmeticException | NullPointerException e) {
            System.out.println(e);
           // e.printStackTrace();
            //System.out.println(e.getMessage());
        }
       //System.out.println("Dekho exception aiiii");

    }
}
