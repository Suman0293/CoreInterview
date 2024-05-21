package exception.multiple;

public class NumberFormatException {
    public static void main(String[] args) {
        String name = "suman";
        try {
            int i = Integer.parseInt(name);
            System.out.println(i);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("dekho aa gai");
    }
}
