package collection.smn;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class GetDuplicateElements {

    public static void main(String[] args) {
        ArrayList a=new ArrayList();
        a.add(2);
        a.add(4);
        a.add(4);
        a.add(7);
        a.add(0);
        /*
         * System.out.println(a);
         *
         * HashSet s=new HashSet(a); System.out.println(s);
         */
        HashSet s1=new HashSet();
        HashSet s2=new HashSet();

        for(int i=0; i<a.size();i++) {
            if(s1.add(a.get(i))) {
            }else {
                s2.add(a.get(i));
            }
        }
        System.out.println(s1);
        System.out.println(s2);
    }
}
