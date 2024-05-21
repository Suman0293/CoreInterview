package exception.test;

public class TestStringIndexException {

    public static void main(String[] args) {

        try {

            String name = "suman";

            System.out.println(name.charAt(4));
            //System.out.println(name.length());

        } catch (StringIndexOutOfBoundsException e) {

            System.out.println(e);

        }

    }

}
