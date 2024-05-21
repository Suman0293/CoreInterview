package collection.queue;

import java.util.ArrayDeque;

public class ArrayDeque0 {

    public static void main(String[] args) {
        ArrayDeque q = new ArrayDeque();

        q.add("One");
        q.add("Two");
        q.add("Three");
        q.addFirst("Zero");
        q.addLast("Four");
        q.add(10);

        Object ele = q.element();
        System.out.println(q);
        q.remove();
        System.out.println(q);
        q.removeFirst();
        System.out.println(q);
        q.removeLast();
        System.out.println(q);
    }


}

