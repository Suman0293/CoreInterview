package collection.smn;


import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
    public static void main(String[] args) {

        HashSet s = new HashSet();

		s.add(2);
		s.add(22);
		s.add("a");
		s.add("a");
		s.add(null);
		s.add(9);
		s.add(null);

		System.out.println(s);
		System.out.println("----------------------------------------");

		Iterator it=s.iterator();
		while (it.hasNext()) {
			Object o = (Object) it.next();
			System.out.println(o);
		}

//        s.add("Suman");
//        s.add("ABS");
//        s.add("ABS");
//        s.add(10);
//        s.add(2);
//        s.add(4);
//
//
//        System.out.println(s);
//
//        Iterator it = s.iterator();
//        while (it.hasNext()) {
//            System.out.println(it.next());
//
//        }
    }

}
