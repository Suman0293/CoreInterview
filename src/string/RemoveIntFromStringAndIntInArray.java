package string;

import java.util.Arrays;

public class RemoveIntFromStringAndIntInArray {

    public static void main(String[] args) {

        String name = "suman1234";
        char[] ch = name.toCharArray();
        String result = "";

        for (int i = 0; i < ch.length; i++) {
            if (Character.isDigit(ch[i])) {
                result = result + ch[i];
            }
        }
        char[] ch1 = result.toCharArray();
        int[] intArray = new int[ch1.length];
        for (int i = 0; i < ch1.length; i++) {
            intArray[i] = Integer.parseInt(String.valueOf(ch1[i]));
        }
        System.out.println(Arrays.toString(intArray));
    }
}

