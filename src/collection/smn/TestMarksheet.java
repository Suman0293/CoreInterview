package collection.smn;

import java.util.*;

public class TestMarksheet {

    public static void main(String[] args) {

        Marksheet m = new Marksheet("naman", "101", 90);
        Marksheet m1 = new Marksheet("nama", "101", 90);

//        ArrayList list1 = new ArrayList();
//        list1.add(m);
//
//        ArrayList list2 = new ArrayList();
//        list2.add(m1);
//
//        if (list1.equals(list2)) {
//            System.out.println("p");
//        } else {
//            System.out.println("f");
//        }
//
//        Map<Marksheet, String> map = new HashMap<Marksheet, String>();
//        map.put(m, "one");
//        map.put(m1, "two");
//        System.out.println(map.size());
//        System.out.println(map);
//
//        System.out.println("---------------------------");

        Set s = new HashSet();
        s.add(m);
        s.add(m1);
        System.out.println(s);

    }

}
