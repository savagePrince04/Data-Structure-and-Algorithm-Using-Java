package Lec13;

public class Product_less_then_k_Brute {
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        int k=10;
        CountProduct(arr,k);
    }
    public static void CountProduct(int arr[],int k){
        int count=0;
        for(int i=0;i<arr.length;i++){
            int p=1;
            for(int j=i;j< arr.length;j++){
                p=p*arr[j];
                if(p<k){
                    count++;
                }
                else {
                    break;
                }
            }
        }
        System.out.println(count);
    }
}
