package string;

public class OccurenceOfAnyOneLetterInString {

    public static void main(String[] args) {

        String name = "suman kumari";
        int count = 0;

        for(int i = 0; i<name.length(); i++) {
            char ch = name.charAt(i);

            String st = name.valueOf(ch);

            if(st.matches("s")) {
                count++;
            }
        }

        System.out.println(count);
    }

}
