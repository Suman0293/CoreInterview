package collection.list;


import java.util.Enumeration;
import java.util.Iterator;
import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {

        Stack s=new Stack();

        s.push(" ");
        s.push(2);
        s.push(3);
        s.add(null);
        s.push("a");
        s.add(10);
        s.add(2);
        s.add(null);

        System.out.println(s);
        System.out.println(s.peek());
        System.out.println("----------------------------------------");
        System.out.println(s.pop());
        System.out.println(s);
        System.out.println("----------------------------------------");
        System.out.println(s.capacity());
        System.out.println("----------------------------------------");
        s.push("a");

        Enumeration en=s.elements();
        while(en.hasMoreElements()) {
            System.out.println(en.nextElement());
        }
        System.out.println("----------------------------------------");
        Iterator it=s.iterator();
        while (it.hasNext()) {

            System.out.println(it.next());
        }
    }

}

