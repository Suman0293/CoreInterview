package exception.multiple;

public class MultipleException {
    public static void main(String[] args) {
        // String name= null;
        String name = "suman";
        try {

            System.out.println(name.charAt(10));
            System.out.println(name.length());

        } catch (NullPointerException e) {
            e.printStackTrace();
            //System.out.println("name khali h");

        } catch (StringIndexOutOfBoundsException e) {
            e.printStackTrace();
            //System.out.println("String 5 nhi 4 word ka h");
        }
    }
}
