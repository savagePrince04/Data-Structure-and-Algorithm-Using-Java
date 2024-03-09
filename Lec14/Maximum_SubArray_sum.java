package Lec14;

public class Maximum_SubArray_sum {
    public static void main(String[] args) {
        int arr[]={2,3,5,6,7,8,25};
        int k=3;
        MaxSum(arr,k);
    }
    public static void MaxSum(int arr[],int k){
        // find the sum of 1st window
        int sum=0;
        int ans=0;
        int si=0;
        int ei=0;
        for(int i=0;i<k;i++){
            sum=sum+arr[i];
        }
        ans=Math.max(sum,ans);
        for(int i=k;i<arr.length;i++){
            // Array grow
            sum=sum+arr[i];
            // Array shrink
            sum=sum-arr[i-k];
            if(sum>ans){
                ans=sum;
                si=i-k+1;
                ei=i;
            }
            //ans=Math.max(sum,ans);
        }
        System.out.println(ans);
        for(int i=si;i<=ei;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
