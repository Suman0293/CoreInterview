package collection.list;

import java.util.Enumeration;
import java.util.Vector;
import java.util.concurrent.ArrayBlockingQueue;

public class TestFailSafe {

    public static void main(String[] args) {

        Vector v = new Vector();

        v.add("one");
        v.add(100);
        v.add(false);
        v.add("abc");


        Enumeration e = v.elements();

        v.add("pqr");

        while (e.hasMoreElements()) {

            System.out.println(e.nextElement());

        }

    }

}
