package Lec10;

import java.util.Stack;

public class Stack_java {
    public static void main(String[] args) {
        Stack<Integer> sc = new Stack<>();
        sc.add(10);
        sc.add(20);
        sc.add(30);
        sc.add(40);
        System.out.println(sc);
        System.out.println(sc.size());
        System.out.println(sc.pop());
        System.out.println(sc.peek());

    }
}
