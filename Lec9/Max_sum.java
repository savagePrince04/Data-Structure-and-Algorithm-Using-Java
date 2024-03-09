package Lec9;

public class Max_sum {
    public static void main(String[] args) {
        int arr[] ={5,6,7,10,45,8};
        Sum(arr);
    }
    public static void Sum(int arr[]){
        int sum=0;
        int ans = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
            ans = Math.max(ans,sum);
            if(sum<0){
                sum=0;
            }
        }
        System.out.println(ans);
    }
}
