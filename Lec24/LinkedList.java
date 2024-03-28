package Lec24;

public class LinkedList {
    class node{
        int data;
        node next;
    }
    node head;
    node tail;
    int size;
    public void InsertAtBeginning(int data){
        node newnode=new node();
        newnode.data=data;
        if(size==0){
            head=newnode;
            tail=newnode;
            size++;
        }
        else {
            newnode.next=head;
            head=newnode;
            size++;
        }
    }
    public void InsertAtlast(int data){
        if(size==0){
            InsertAtBeginning(data);
        }
        else{
            node newnode=new node();
            newnode.data=data;
            tail.next=newnode;
            tail=newnode;
            size++;
        }
    }
    public void InsertAtIndex(int data,int k) throws Exception{
        if(k<0 || k>size){
            throw new Exception("invalid input");
        }
        if(size==0){
            InsertAtBeginning(data);
        }
        else if (size==k) {
            InsertAtlast(data);
        }
        else {
            node newnode =new node();
            newnode.data=data;
            node Kthnode = GetNode(k-1);
            newnode.next=Kthnode.next;
            Kthnode.next=newnode;
            size++;
        }
    }
    public node GetNode(int k) throws Exception{
        if(k<0 || k>size){
            throw  new Exception("phir se input do");
        }
        node temp=head;
        for(int i=0;i<k;i++){
            temp=temp.next;
        }
        return temp;
    }
    public int GetFirst(){
        return head.data;
    }
    public int GetLast(){
        return tail.data;
    }
    public int GetAtIndex(int k) throws Exception{
        return GetNode(k).data;
    }

    // remove
    public int RemoveAtFirst(){
        int rv=head.data;
        if(size==1){
            head=null;
            tail=null;
        }
        else{
            node temp=head;
            head=head.next;
            temp.next=null;
        }
        size--;
        return rv;
    }
    public int RemoveAtLast() throws Exception{
        if(size==1){
            return RemoveAtFirst();
        }
        else{
            int rv=tail.data;
            node s1=GetNode(size-2);
            s1.next=null;
            tail=s1;
            size--;
            return rv;
        }
    }
    public int RemoveAtIndex(int k) throws Exception{
        if(k==0){
            return RemoveAtFirst();
        }
        else if(k==size-1){
             return RemoveAtLast();
        }
        else{
            node rv=GetNode(k);
            node kth=GetNode(k-1);
            kth.next=rv.next;
            rv.next=null;
            size--;
            return rv.data;
        }
    }
    public void Display(){
        node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"=>");
            temp=temp.next;
        }
    }
}
