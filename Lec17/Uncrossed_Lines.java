package Lec17;
import java.util.Arrays;
public class Uncrossed_Lines {
    public static void main(String[] args) {
        int arr1[]={2,5,1,2,5};
        int arr2[]={10,5,2,1,5,2};
        int dp[][]=new int [arr1.length][arr2.length];
                for(int a[]:dp){
                    Arrays.fill(a,-1);
                }
                int ans= UncloseLine(arr1,arr2,0,0,dp);
                System.out.println(ans);
            }
            public static int UncloseLine(int arr1[],int arr2[],int i,int j,int dp[][]){
                if(arr1.length==i || arr2.length==j){
                    return 0;
                }
                if(arr1[i]==arr2[j]){
                    return 1+UncloseLine(arr1,arr2,i+1,j+1,dp);
                }
                if(dp[i][j]!=-1){
                    return dp[i][j];
                }
                else {
                    int f=UncloseLine(arr1,arr2,i+1,j,dp);
                    int s=UncloseLine(arr1,arr2,i,j+1,dp);
                    return dp[i][j]=Math.max(f,s);
                }
            }
        }
