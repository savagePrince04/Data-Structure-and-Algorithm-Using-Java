package Lec41;

public class Heap_client {
    public static void main(String[] args) {
        Heap sc=new Heap();
        sc.add(10);
        sc.add(20);
        sc.add(30);
        sc.add(40);
        sc.add(50);
        sc.add(5);
        sc.add(100);
        sc.Remove();
        sc.Display();
    }
}
