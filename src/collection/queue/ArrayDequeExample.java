package collection.queue;


import java.util.ArrayDeque;
import java.util.Iterator;

public class ArrayDequeExample {
    public static void main(String[] args) {

        ArrayDeque a=new ArrayDeque();

        a.offer(4);
        a.offer(2);
        a.offer("s");
        a.offerFirst(9);
        a.offerLast(6);
        a.offer(1);

        System.out.println(a);
//		System.out.println("------------------------------------------------------");
        System.out.println(a.peek());
//		System.out.println("------------------------------------------------------");
        System.out.println(a.peekLast());
//		System.out.println("------------------------------------------------------");
        System.out.println(a.peekFirst());
//		System.out.println(a);
//		System.out.println("------------------------------------------------------");
        System.out.println(a.poll());
//		System.out.println(a);
//		System.out.println("------------------------------------------------------");
        System.out.println(a.getLast());
//		System.out.println("------------------------------------------------------");
//		System.out.println(a.pollLast());
//		System.out.println(a);
//		System.out.println("------------------------------------------------------");

//
//		for(Object o:a) {
//			System.out.println(o);
//		}
//		System.out.println("------------------------------------------------------");
//		Iterator it=a.iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
    }

}


