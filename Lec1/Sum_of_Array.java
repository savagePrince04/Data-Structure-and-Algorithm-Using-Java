package Lec1;

public class Sum_of_Array {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
        System.out.println(Sum(arr,0));
    }
    public static int Sum(int arr[],int index){
        if(arr.length==index){
            return 0;
        }
        int ele=arr[index];
        int ans=Sum(arr,index+1);
        return ele+ans;
    }
}
