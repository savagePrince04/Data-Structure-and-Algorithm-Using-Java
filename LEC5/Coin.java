package LEC5;

public class Coin {
    public static void main(String[] args) {
        int n=3;
        printans(n,"");
    }
    public static void printans(int n,String ans){
        if(n==0){
            System.out.println(ans);
            return;
        }
        printans(n-1,ans+"H");
        printans(n-1,ans+"T");
    }
    }
