package Lec19;

import java.util.Arrays;

public class Aggerecive_Cow {
    public static void main(String[] args) {
        int arr[]={1,2,8,4,9};  // stall
        int n=5;
        int c=3;
        AggereciveCow(arr,n,c);
    }
    public static void AggereciveCow(int arr[],int n,int c){
        Arrays.sort(arr);
        // find search space
        int left = 1;
        int right= arr.length-1;
        int ans=0;
        while(left<=right){
            // here mid represent minimum possible distance between two cow
            int mid = (left+right)/2;
            // is it is possible to place all the cows atleast mid distance apart
            if(IsPossible(arr,n,c,mid)){
                ans=mid;
                // if it is possible then i want to increace the distance further
                left=mid+1;
            }
            else {
                // if it is not possible to place all the cows atleast mid distance
                // then i need to decreace the mid distance
                right=mid-1;
            }

        }
        System.out.println(ans);
    }
    public static boolean IsPossible(int arr[],int n,int c,int mid){
        int count = 1;
        int pos = arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]-pos>=mid){
                count++;
                pos=arr[i];
            }
            if(count==c){
                return true;
            }
        }
        return false;
    }
}
