package Lec1;

public class First_Occ {
    public static void main(String[] args) {
        int arr[] ={10,20,30,40,50};
        int item=40;
        System.out.println(Find(arr,item,0));
    }
    public static int Find(int arr[],int item,int index){
        if(index==arr.length){
            return -1;
        }
        if(arr[index]==item){
            return index;
        }
        return Find(arr,item,index+1);
    }
}
