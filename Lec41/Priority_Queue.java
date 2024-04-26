package Lec41;

import java.util.Collections;
import java.util.PriorityQueue;
public class Priority_Queue {
    public static void main(String[] args) {
       // PriorityQueue <Integer> sc=new PriorityQueue<>();
        PriorityQueue <Integer> sc=new PriorityQueue<>(Collections.reverseOrder());
        sc.add(10);
        sc.add(20);
        sc.add(30);
        sc.add(40);
        sc.add(50);
        sc.add(1);
        sc.add(2);
        System.out.println(sc);
    }
}
