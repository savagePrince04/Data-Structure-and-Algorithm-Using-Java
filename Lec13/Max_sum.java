package Lec13;

public class Max_sum {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,8};
        int k=3;
        MaxSum(arr,k);
    }
    public static void MaxSum(int arr[],int k){
        int sum=0;
        int ans=0;
        // find the sum of 1st window
        int si=0;
        int ei=0;
        for(int i=0;i<k;i++){
            sum=sum+arr[i];
        }
        ans=sum;
        for(int i=k;i< arr.length;i++){
            //array grow
            sum=sum+arr[i];
            //Array shrink
            sum=sum-arr[i-k];
            if(sum>ans){
                ans=sum;
                si=i-k+1;
                ei=i;
            }
        }
        System.out.println(ans);
        for(int i=si;i<=ei;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
