package string;

public class RemoveDuplicateChar {
    public static void main(String[] args) {

        String name = "programming";

        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);
            int idx = name.indexOf(ch, i + 1);
            // System.out.print(idx);
            if (idx == -1){
                System.out.print(ch);

            }
        }

    }
}
