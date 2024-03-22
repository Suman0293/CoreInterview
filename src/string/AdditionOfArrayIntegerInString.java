package string;

public class AdditionOfArrayIntegerInString {

    public static void main(String[] args) {
        String[] name = {"suman12344"};
        int count = 0;

        for (String s : name) {
            char[] ch = s.toCharArray();
            for (int i = 0; i < s.length(); i++) {
                if (Character.isDigit(ch[i])) {
                    count += Integer.parseInt(String.valueOf(ch[i]));
                }
            }
        }
        System.out.println(count);
    }
}
