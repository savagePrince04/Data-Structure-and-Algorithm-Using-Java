package Lec15;
import java.util.Arrays;
public class Distinct_Subsequences {
    public static void main(String[] args) {
        String s = "rabbbit";
        String t = "rabbit";
                int dp[][]=new int[s.length()][t.length()];
                for(int a[]:dp){
                    Arrays.fill(a,-1);
                }
                int ans=Distinct(s,t,0,0,dp);
             System.out.println(ans);
            }
            public static int Distinct(String s,String t,int i,int j,int dp[][]){
                if(j==t.length()){
                    return 1;
                }
                if(i==s.length()){
                    return 0;
                }
                if(dp[i][j]!=-1){
                    return dp[i][j];
                }
                int take=0;
                int non_take=0;
                if(s.charAt(i)==t.charAt(j)){
                    take=Distinct(s,t,i+1,j+1,dp);
                }
                non_take=Distinct(s,t,i+1,j,dp);
                return dp[i][j]=take+non_take;
            }
        }