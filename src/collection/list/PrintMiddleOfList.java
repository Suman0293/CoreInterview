package collection.list;

import java.util.ArrayList;
import java.util.List;

public class PrintMiddleOfList {
    public static void main(String[] args) {

        List l=new ArrayList();

        l.add(2);
        l.add(3);
        l.add(10);
        l.add(9);
        l.add("a");
        l.add(5);
        l.add(6);
        l.add(8);
        l.add(10);
        System.out.println(l);
        System.out.println(l.get((l.size()-1)/2));
    }

}

