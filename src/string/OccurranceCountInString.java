package string;

public class OccurranceCountInString {

    public static void main(String[] agrs) {

        String name = "suman";
        int count = 0;

        for (char a = 'a'; a <= 'z'; a++) {

            for (int i = 0; i < name.length(); i++) {

                if (name.charAt(i) == a) {
                    count++;
                }
            }
            if (count == 0) {
                System.out.println(a);
            } else {
                count = 0;
            }
        }
    }
}
