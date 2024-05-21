package collection.smn;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap m = new HashMap();
        m.put(0, "A");
        m.put(1, null);
        m.put(3, 10);
        m.put(4, "a");
        m.put(1, 100);

        System.out.println(m);
        System.out.println("----------------------------------------");
        System.out.println(m.values());
        System.out.println("----------------------------------------");
        System.out.println(m.containsKey(3));
        System.out.println("----------------------------------------");
        System.out.println(m.isEmpty());
        System.out.println("----------------------------------------");
        System.out.println(m.containsValue(9));
        System.out.println("----------------------------------------");
        System.out.println(m.keySet());
        System.out.println("----------------------------------------");
        System.out.println(m.hashCode());
        System.out.println("----------------------------------------");
        System.out.println(m.entrySet());
        System.out.println("----------------------------------------");

//        for(Object o: m.entrySet()) {
//            System.out.println(o);
//        }
    }

}


