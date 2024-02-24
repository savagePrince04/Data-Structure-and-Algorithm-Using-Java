package Lec6;

import java.util.*;

public class GenerateParenthesis {
    public static void main(String[] args) {
        int n=3;
        List<String> ll = new ArrayList<>();
        Printans(n,0,0,"",ll);
    }
    public static void Printans(int n,int open,int close,String ans,List<String> ll){
        if(open==n && close==n){
            ll.add(ans);
            System.out.print(ll);
            return;
        }
//        if(open<n){
//            Printans(n,open+1,close,ans+"(");
//        }
//        if(close<open){
//            Printans(n,open,close+1,ans+")");
//        }
        if(open>n || close>open){
            return;
        }
        Printans(n,open+1,close,ans+"(",ll);
        Printans(n,open,close+1,ans+")",ll);
    }
}
