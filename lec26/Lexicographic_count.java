package lec26;

import java.util.ArrayList;
import java.util.List;

public class Lexicographic_count {
    public static void main(String[] args) {
        List<Integer> ll=new ArrayList<>();
        int n=1000;
        for(int i=1;i<10;i++){
            printCount(n,i,ll);
        }
        System.out.println(ll);
    }
    public static void printCount(int n,int curr,List<Integer>ll){
        if(curr>n){
            return;
        }
        ll.add(curr);
        for(int i=0;i<10;i++){
            printCount(n,curr*10+i,ll);
        }
    }
}
