package collection.list;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {
    public static void main(String[] args) {

        ArrayList a = new ArrayList();

        a.add(2);
        a.add(4);
        System.out.println(a);
        System.out.println("----------------------------------");

        ArrayList a1 = new ArrayList();
        a1.add(20);
        a.add(null);
        a.add(" ");
        a1.add(40);
        System.out.println(a1);
        System.out.println("----------------------------------");

        a1.addAll(a);
        System.out.println(a1);

        System.out.println("----------------------------------");
        System.out.println(a.size());
        System.out.println(a1.size());

        System.out.println("----------------------------------");
        Iterator it = a1.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("----------------------------------");
        a.add(null);
        System.out.println(a);

    }

}

