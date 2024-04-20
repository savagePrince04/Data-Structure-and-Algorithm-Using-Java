package Lec14;
import java.util.Arrays;
public class Min_Cost_Climbing_Stairs {
    public static void main(String[] args) {
        int cost[]={1,100,1,1,1,100,1,1,100,1};
        int dp[]=new int[cost.length];
        Arrays.fill(dp,-1);
        int Zeroth=MinCost(cost,0,dp);
        int First=MinCost(cost,1,dp);
        int ans=Math.min(Zeroth,First);
        System.out.println(ans);
            }
    public static int MinCost(int nums[],int i,int dp[]){
        if(i>=nums.length){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        int s1=MinCost(nums,i+2,dp);
        int s2=MinCost(nums,i+1,dp);
        return dp[i]=Math.min(s1,s2)+nums[i];
    }
        }