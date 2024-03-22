package string;

public class OccuranceArrayInString {
     public static void main(String[] args) {

         String[] name = { "suman kumari" };

         for (String st : name) {
             for (char a = 'a'; a <= 'z'; a++) {
                 int count = 0;
                 for (int i = 0; i < st.length(); i++) {
                     if (a == st.charAt(i)) {
                         count++;

                     }
                 }
                 if(count != 0) {
                     System.out.println(a +" - "+count);
                 }
             }
         }
    }
}
