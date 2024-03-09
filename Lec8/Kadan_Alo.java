package Lec8;

public class Kadan_Alo {
    public static void main(String[] args) {
        int arr[] ={-2,-3,-4,0};
        int ans=Max_Sum(arr);
        System.out.println(ans);
    }
    public static int Max_Sum(int arr[]){
        int ans=Integer.MIN_VALUE;
        int sum = 0;
        for(int i = 0;i<arr.length;i++){
            sum=sum+arr[i];
            ans = Math.max(ans,sum);
            if(sum<0){
                sum=0;
            }
        }
        return ans;
    }
}
