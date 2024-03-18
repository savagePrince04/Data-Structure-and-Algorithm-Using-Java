package Lec17;

public class Maximum_Average_Subarray_I {
    public static void main(String[] args) {
        int arr[]={1,12,-5,-6,50,3};
        int k=4;
        System.out.println(findMaxAverage(arr,k));
    }
    public static double findMaxAverage(int[] nums, int k) {
        // find the sum of 1st window
        double sum=0;
        double ans=0;
        for(int i=0;i<k;i++){
            sum=sum+nums[i];
        }
        ans=sum;
        for(int i=k;i<nums.length;i++){
            // array grow
            sum=sum+nums[i];
            // array shrink
            sum=sum-nums[i-k];
            ans=Math.max(ans,sum);
        }
        return ans/k;
    }
}
