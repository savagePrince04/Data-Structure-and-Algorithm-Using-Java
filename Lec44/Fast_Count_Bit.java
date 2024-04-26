package Lec44;

public class Fast_Count_Bit {
    public static void main(String[] args) {
        int n=21;
        int count=0;
        while (n>0){
            count++;
            n=(n &(n-1));
        }
        System.out.println(count);
    }
}
