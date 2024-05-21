package collection.list;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class RemoveDuplicateFromArrayList {
    public static void main(String[] args) {

        ArrayList a=new ArrayList();
        a.add(2);
        a.add(4);
        a.add(4);
        a.add("a");
        a.add(7);
        a.add(0);
        a.add(13);
        a.add("a");
        a.add(7);
        System.out.println(a);

        HashSet h=new HashSet(a);
        System.out.println(h);
    }

}

