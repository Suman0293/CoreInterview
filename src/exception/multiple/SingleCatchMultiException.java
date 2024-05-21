package exception.multiple;

public class SingleCatchMultiException {
    public static void main(String[] args) {
        String s = "suman";
        //String s = null;
        try {
            System.out.println(s.charAt(4));
            System.out.println(s.length());
        } catch (NullPointerException | StringIndexOutOfBoundsException e) {
            e.printStackTrace();

        }
        //System.out.println("ab dekho aiii exception");

    }
}
