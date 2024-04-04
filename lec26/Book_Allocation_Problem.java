package lec26;

public class Book_Allocation_Problem {
    public static void main(String[] args) {
        int arr[]={12,34,67,90};
        int book=4;
        int nos=2;
        MinPaje(arr,book,nos);
    }
    public static void MinPaje(int arr[],int book,int nos){
        int low=0;
        int high=0;
        int ans=0;
        for(int i=0;i<arr.length;i++){
            high+=arr[i];
        }
        while(low<=high){
            int mid =(low+high)/2;
            if(IsitPossible(arr,book,nos,mid)){
                ans=mid;
                high = mid - 1;
            }
            else{
                low=mid+1;
            }
        }
        System.out.println(ans);
    }
    public static boolean IsitPossible(int arr[],int book,int nos,int mid){
        int student=1;
        int readPage=0;
        for(int i=0;i<book;){
            if(readPage+arr[i]<=mid){
                readPage=readPage+arr[i];
                i++;
            }
            else{
                student++;
                readPage=0;
            }
            if(student>nos){
                return false;
            }
        }
        return true;
    }
}
