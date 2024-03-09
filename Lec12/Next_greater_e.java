package Lec12;

import java.util.Stack;

public class Next_greater_e {
    public static void main(String[] args) {
        int arr[] ={5,2,8,9,10,12,6};
        NGE(arr);
    }
    public static void NGE(int arr[]){
        Stack<Integer> sc= new Stack<>();
        int n= arr.length;
        int ans[] = new int[n];
       for(int i=0;i<n;i++){
           while(!sc.isEmpty() && arr[i]>arr[sc.peek()]){
               ans[sc.pop()] =arr[i];
           }
           sc.push(i);
       }
       while (!sc.isEmpty()){
           ans[sc.pop()] =-1;
       }
       for(int i=0;i< ans.length;i++){
           System.out.print(ans[i]+" ");
       }
    }
}
