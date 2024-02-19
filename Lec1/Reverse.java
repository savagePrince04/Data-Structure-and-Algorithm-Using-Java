package Lec1;

public class Reverse {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
        Reverse_array(arr,0);
    }
    public static void Reverse_array(int arr[],int index){
        if(arr.length==index){
            return;
        }
        Reverse_array(arr, index+1);
        System.out.print(arr[index]+" ");
    }
}
