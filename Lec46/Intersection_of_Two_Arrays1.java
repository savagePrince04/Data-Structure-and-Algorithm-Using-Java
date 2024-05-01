package Lec46;

import java.util.HashSet;

public class Intersection_of_Two_Arrays1 {
    public static void main(String[] args) {
        int nums1[]={1,2,2,1};
        int nums2[]={2,2};
        Intersection(nums1,nums2);
    }
    public static void Intersection(int arr1[],int arr2[]){
        HashSet<Integer> set1=new HashSet<>();
        for(int n1:arr1){
            set1.add(n1);
        }
        HashSet<Integer>set2=new HashSet<>();
        for(int n2:arr2){
            if(set1.contains(n2)){
                set2.add(n2);
            }
        }
        int ans[]=new int[set2.size()];
        int j=0;
        for(int ele:set2){
            ans[j]=ele;
            j++;
        }
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
