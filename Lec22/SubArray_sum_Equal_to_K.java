package Lec22;

import java.util.HashMap;

public class SubArray_sum_Equal_to_K {
    public static void main(String[] args) {
       int arr[]={1,2,3,4};
       int k=9;
       FindSum(arr,k);
    }
    public static void FindSum(int arr[],int k){
        HashMap<Integer,Integer> sc = new HashMap<>();
        int sum=0;
        int count=1;
        if(sum==k){
            count++;
        }
        for(int num:arr){
            sum=sum+num;
            if(sc.containsKey(sum-k)){
                count=count+sc.get(sum-k);
            }
                sc.put(sum,sc.getOrDefault(sum,0)+1);
        }
        System.out.println(count);
    }
}
