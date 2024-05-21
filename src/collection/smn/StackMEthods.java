package collection.smn;

import java.util.Stack;

public class StackMEthods {

    public static void main(String[] args) {

        Stack s = new Stack();

        s.push("Suman");
        s.push("Bhardwaj");
        s.push(24);
        s.push(null);
        s.push("smn");

        System.out.println(s);
        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s);



    }


}

