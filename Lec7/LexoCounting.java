package Lec7;

public class LexoCounting {
    public static void main(String[] args) {
        int n=1000;
        count(n,0);
    }
    public static void count(int n,int cur){
        if(cur>n){
            return;
        }
        System.out.println(cur);
        int i=0;
      if(cur==0){
           i=1;
       }
        for(;i<=9;i++){
        count(n,cur*10+i);
        }
    }
}