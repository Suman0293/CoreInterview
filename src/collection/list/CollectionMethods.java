package collection.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class CollectionMethods {
    public static void main(String[] args) {
        Collection c = new ArrayList();

        c.add(2);
        c.add(4);
        c.add("A");

        System.out.println(c);
        System.out.println("---------------------------------");
        System.out.println(c.isEmpty());
        System.out.println("---------------------------------");
        System.out.println(c.contains("C"));
        System.out.println("---------------------------------");
        System.out.println(c.containsAll(c));
        System.out.println("---------------------------------");
//        System.out.println(c.remove(1));
//        System.out.println("---------------------------------");
//        c.remove(4);
//        System.out.println(c);
//        System.out.println("---------------------------------");
       System.out.println(c.size());
        System.out.println("---------------------------------");


//        Collection c2 = new HashSet();
//        c2.add(2);
//        c2.add("A");
//        c2.add(2);
//        c2.add(6);
//        System.out.println(c2);
//        System.out.println("---------------------------------");
//        c.retainAll(c2);
//        System.out.println(c);
//        System.out.println("---------------------------------");
//        c.addAll(c2);
//        System.out.println(c);
//        System.out.println("---------------------------------");
//        Iterator it = c.iterator();
//        while (it.hasNext()) {
//            System.out.println(it.next());
//        }
        /*
         * System.out.println("---------------------------------"); Collection c3= new
         * PriorityQueue(); c3.add("v"); c3.add(4); c3.add(null); // c.addAll(c3);
         * System.out.println(c3);
         * System.out.println("---------------------------------");
         *
         * Collection c4=(Collection) new HashMap(); c4.add(44); c4.add("")
         */
//        System.out.println("---------------------------------");
//        Collection c4 = new LinkedList();
//        c4.add(8);
//        c4.add("s");
//        c4.add(9);
//        System.out.println(c4);
//        System.out.println("---------------------------------");
//        c.addAll(c4);
//        System.out.println(c);
//        System.out.println("---------------------------------");
//        //c4.clear();
//        System.out.println(c4);
//        c.removeAll(c4);
//        System.out.println(c);


    }

}
