package collection.list;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {

        Vector v=new Vector();
        v.addElement(" ");
        v.addElement(22);
        v.addElement(3);
        v.addElement(" ");
        v.addElement("a");
        v.add(null);
        v.add(null);
        System.out.println(v);
        System.out.println("----------------------------------------");
        Iterator it=v.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("----------------------------------------");
        Enumeration en=v.elements();
        while(en.hasMoreElements()) {
            System.out.println(en.nextElement());
        }
        System.out.println("----------------------------------------");
        v.addElement(5);
        System.out.println(v);
        System.out.println("----------------------------------------");
        System.out.println(v.capacity());
        System.out.println("----------------------------------------");
        v.insertElementAt(4, 3);
        System.out.println(v);
        System.out.println("----------------------------------------");
        v.setElementAt(6, 1);
        System.out.println(v);
    }

}

