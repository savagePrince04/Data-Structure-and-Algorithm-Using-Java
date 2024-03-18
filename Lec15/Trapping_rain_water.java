package Lec15;

public class Trapping_rain_water {
    public static void main(String[] args) {
        int arr[]={4,2,0,3,2,5};
        Trap(arr);
    }
    public static void Trap(int arr[]){
        int n= arr.length;
        int left[]=new int[n];
        int ans=0;
        left[0]=arr[0];
        for(int i=1;i<n;i++){
            left[i]=Math.max(left[i-1],arr[i]);
        }
        int right[]=new int [n];
        right[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--){
            right[i]=Math.max(right[i+1],arr[i]);
        }
        for(int i=0;i< right.length;i++){
            ans=ans+Math.min(left[i],right[i])-arr[i];
        }
        System.out.println(ans );
    }
}
