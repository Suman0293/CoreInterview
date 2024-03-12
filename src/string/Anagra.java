package string;


import java.util.Arrays;

public class Anagra {
   public static void main(String[] args){
       String s1 ="care";
       String s2 = "race";

       char[] ar1 = s1.toCharArray();
       char[] ar2 = s2.toCharArray();

       Arrays.sort(ar1);
       Arrays.sort(ar2);

       if(Arrays.equals(ar1,ar2)){
           System.out.println(s1 + " " + s2 + " They are Anagra");
       }else{
           System.out.println(s1 + " " + s2 + " they are not Anagra");
       }
   }
}
