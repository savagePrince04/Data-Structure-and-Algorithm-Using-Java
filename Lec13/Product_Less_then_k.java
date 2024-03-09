package Lec13;

public class Product_Less_then_k {
    public static void main(String[] args) {
        int arr[]={5,2,3,4,6,7};
        int k=3;
        MaxSum(arr,k);
    }
    public static void MaxSum(int arr[],int k){
        int sum=0;
        int ans=0;
        // find the sum 1st window
        for(int i=0;i<k;i++){
            sum=sum+arr[i];
        }
        ans=Math.max(sum,ans);
        int si=0;
        int ei=0;
        for(int i=k;i< arr.length;i++){
            // grow
            sum=sum+arr[i];
            //shrink
            sum=sum-arr[i-k];
            //ans
            //ans=Math.max(sum,ans);
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
