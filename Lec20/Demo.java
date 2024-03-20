package Lec20;

public class Demo {

    public static void print(int n){

        if(n == 0){
            return;
        }
        print(n-1);
        System.out.print(n+" ");
    }

    public static void main(String[] args){

        print(10000);
    }
}
