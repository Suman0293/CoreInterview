package collection.list;

import java.util.ArrayList;
import java.util.List;

public class RetainAll {
    public static void main(String[] args) {
        List l = new ArrayList();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(8);
        System.out.println(l);
        System.out.println("--------------------------------------");


        List l1 = new ArrayList();
        l1.add(1);
        l1.add(2);
        l1.add(5);
        l1.add(4);

        //System.out.println(l.removeAll(l1));
        System.out.println(l.retainAll(l1));
        System.out.println(l);
    }
}