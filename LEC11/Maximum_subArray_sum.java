package LEC11;

public class Maximum_subArray_sum {
    public static void main(String[] args) {
        int arr[] = {5,9,8,-2,3,4,5,6,8,1};
        int ans=sum(arr);
        System.out.println(ans);
    }
    public static int sum(int arr[]){
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=i;j< arr.length;j++){
                sum = sum + arr[j];
                ans = Math.max(ans,sum);
            }
        }
        return ans;
    }
}
