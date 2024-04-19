package Lec39;

import java.util.Arrays;

public class Knapsack_0_1 {
    public static void main(String[] args) {
        int m=5;
        int cap=4;
        int w[]={1,2,3,2,2};
        int v[]={8,4,0,5,3};
        int dp[][]=new int[cap+1][w.length];
        for(int a[]:dp){
            Arrays.fill(a,-1);
        }
       int ans= Knapsack(w,v,cap,0,dp);
        System.out.println(ans);
    }
    public static int Knapsack(int w[],int v[],int cap,int i,int dp[][]){
        if(cap==0 || w.length==i){
            return 0;
        }
        if(dp[cap][i]!=-1){
            return dp[cap][i];
        }
        int pick=0;
        int not_pick=0;
        if(w[i]<=cap){
            pick=v[i]+Knapsack(w,v,cap-w[i],i+1,dp);
        }
        not_pick=Knapsack(w,v,cap,i+1,dp);
        return dp[cap][i]=Math.max(pick,not_pick);
    }
}
