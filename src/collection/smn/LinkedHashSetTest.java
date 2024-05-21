package collection.smn;

import java.util.LinkedHashSet;

public class LinkedHashSetTest {

    public static void main(String[] args) {

        LinkedHashSet h = new LinkedHashSet();

        h.add(1);
        h.add("a");
        h.add("");
        h.add("$");
        h.add(null);
        h.add(null);


        System.out.println(h);
        System.out.println(h.isEmpty());
        System.out.println(h.remove("a"));
        System.out.println(h);

//        System.out.println("----------------------------------");
//        System.out.println(h.getClass());
    }

}

