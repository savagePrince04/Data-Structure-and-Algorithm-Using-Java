package Lec44;

public class Check_Set_UnSet {
    public static void main(String[] args) {
        int n=75;
        int pos=3;
        int mask=1<<pos;
        if((mask & n)!=0){
            System.out.println("set");
        }
        else {
            System.out.println("unset");
        }
    }
}
