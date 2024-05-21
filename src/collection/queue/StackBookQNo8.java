package collection.queue;

import java.util.Stack;

public class StackBookQNo8 {

    public static void main(String[] args) {
        Stack s = new Stack();
        for(char i='a'; i<='z'; i++) {
            System.out.print(s.push(i)+" ");
        }
        System.out.println();

        Stack s1 = new Stack();
        while(!s.isEmpty()) {// holding k liye !s1 krnha hoga to a-z print hoga bs
            System.out.print(s1.push(s.pop())+" ");
        }

        System.out.println();
        while(!s1.isEmpty()) {
            System.out.print(s.push(s1.pop())+" ");
        }
    }
}
