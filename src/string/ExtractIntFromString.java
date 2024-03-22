package string;

import java.util.Arrays;

public class ExtractIntFromString {

    public static void main(String[] args) {

        String name = "suman1234";
        int[] arry = new int[name.length()];

        for (int i = 0; i < name.length(); i++) {
            if (Character.isDigit(name.charAt(i))) {
                arry[i] = Integer.parseInt(String.valueOf(name.charAt(i)));
            }
        }

        /* System.out.println(arry[3] + " , " + arry[4]); */
        System.out.println(arry[6]+arry[8]);
        //System.out.println(Arrays.toString(arry));

    }

}
