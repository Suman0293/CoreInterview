package collection.list;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {

        LinkedList l=new LinkedList();

        l.add("A");
        l.add("B");
        l.add("C");
        l.add("A");
        l.add(2);
        l.add(1);
        System.out.println(l);

        Iterator it=l.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("----------------------------------------");
        System.out.println(l.get(3));
        System.out.println("----------------------------------------");
        System.out.println(l.indexOf("C"));
        System.out.println(l.lastIndexOf(3));
        System.out.println("----------------------------------------");
        l.set(0, "a");
        System.out.println(l);
        System.out.println("----------------------------------------");
        System.out.println(l.contains("D"));
        System.out.println(l.containsAll(l));
        System.out.println("----------------------------------------");
        System.out.println(l.getFirst());
        System.out.println(l.getLast());
        System.out.println("----------------------------------------");
        System.out.println(l.isEmpty());
        System.out.println("----------------------------------------");
        System.out.println(l.subList(2, 4));
    }

}

