package string;

public class NoOFIntegerString {
    public static void main(String[] args) {
        String[] name = {"su12", "123su"};
        int count = 0;

        for (String s : name) {

            char[] ch = s.toCharArray();
            for (int i = 0; i < ch.length; i++) {
                if (Character.isDigit(ch[i])) {
                    count++;
                }
            }
            System.out.println( count);
        }
       /* String name = "suman12345";
        int count = 0;
        //char[] ch = name.toCharArray();

        for (int i = 0; i < name.length(); i++) {
            if (Character.isDigit(name.charAt(i))) {
                count++;
            }
        }
        System.out.println(name+ " = " +count);*/


    }
}
