package Lec42;

import java.util.PriorityQueue;

public class Kth_Max {
    public static void main(String[] args) {
        int arr[]={3,2,1,5,6,4};
        int k=2;
        System.out.println(KthMax(arr,k));
    }
    public static int KthMax(int arr[],int k){
        PriorityQueue<Integer> sc=new PriorityQueue<>();
        for(int i=0;i<k;i++){
            sc.add(arr[i]);
        }
        for(int i=k;i<arr.length;i++){
            if(sc.peek()<arr[i]){
                sc.remove();
                sc.add(arr[i]);
            }
        }
        return sc.peek();
    }
}
