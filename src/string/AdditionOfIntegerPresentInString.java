package string;

public class AdditionOfIntegerPresentInString {
    public static void main(String[] args) {
        String name = "Suman12345";
        int count = 0;

        for (int i = 0; i < name.length(); i++) {
            if (Character.isDigit(name.charAt(i))) {
                count += Character.getNumericValue(name.charAt(i));
            }
        }

        System.out.println(count);
    }
}
