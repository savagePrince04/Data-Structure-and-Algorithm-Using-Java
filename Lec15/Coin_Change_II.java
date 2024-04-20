package Lec15;
import java.util.Arrays;
public class Coin_Change_II {
    public static void main(String[] args) {
            int amount=5;
            int coins[]={1,2,5};
                int dp[][]=new int [amount+1][coins.length];
                for(int a[]:dp){
                    Arrays.fill(a,-1);
                }
                int ans=coin_change(amount,coins,0,dp);
                System.out.println(ans);
            }
            public static int coin_change(int amount,int coins[],int i,int dp[][]){
                if(amount==0){
                    return 1;
                }
                if(coins.length==i){
                    return 0;
                }
                if(dp[amount][i]!=-1){
                    return dp[amount][i];
                }
                int take=0;
                int non_take=0;
                if(coins[i]<=amount){
                    take=coin_change(amount-coins[i],coins,i,dp);
                }
                non_take=coin_change(amount,coins,i+1,dp);
                return dp[amount][i]=take+non_take;
            }
        }