package Lec10;

public class Stack {
   private int arr[];
   int index=-1;
   Stack(){
       arr = new int[5];
   }
   public boolean IsEmpty(){
       return index==-1;
   }
   public boolean Isfull(){
       return index== arr.length-1;
   }
   public void Push(int data){
       index++;
       arr[index]=data;
   }
   public int pop(){
       int rv=arr[index];
       index--;
       return rv;
   }
   public int peek(){
       return arr[index];
   }
   public int size(){
       return index;
   }
   public void Display(){
       for(int i=0;i<index;i++){
           System.out.print(arr[index]+"");
       }
   }
}
