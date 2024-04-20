package Lec14;

import java.util.Arrays;

public class Longest_Common_Subsequence {
    public static void main(String[] args) {
        String s1="abcde";
        String s2="ace";
        int dp[][] = new int [s1.length()][s2.length()];
        for(int a[]:dp){
            Arrays.fill(a,-1);
        }
        int ans=LCS(s1,s2,0,0,dp);
        System.out.println(ans);
    }
    public static int LCS(String s1,String s2,int i,int j,int dp[][]){
        if(s1.length()==i || s2.length()==j){
            return 0;
        }
        if(s1.charAt(i)== s2.charAt(j)){
            return 1+LCS(s1,s2,i+1,j+1,dp);
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        else{
            int s=LCS(s1,s2,i+1,j,dp);
            int f=LCS(s1,s2,i,j+1,dp);
            return dp[i][j]=Math.max(s,f);
        }
    }
}
