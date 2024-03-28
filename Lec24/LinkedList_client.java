package Lec24;

public class LinkedList_client {
    public static void main(String[] args) throws Exception{
        LinkedList sc = new LinkedList();
        sc.InsertAtBeginning(10);
        sc.InsertAtBeginning(20);
        sc.Display();
        System.out.println();
        sc.InsertAtlast(30);
        sc.InsertAtlast(40);
        sc.Display();
        System.out.println();
        System.out.println(sc.GetNode(1).data);
        System.out.println();
        sc.InsertAtIndex(50,3);
        sc.Display();
        System.out.println();
        System.out.println(sc.GetFirst());
        System.out.println(sc.RemoveAtLast());
        System.out.println(sc.RemoveAtIndex(2));
    }
}
