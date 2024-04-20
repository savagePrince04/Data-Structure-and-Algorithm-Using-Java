package Lec16;
import java.util.Arrays;
public class Longest_Increasing_Subsequence {
    public static void main(String[] args) {
            int nums[]={10,9,2,5,3,7,101,18};
        System.out.println(Lis(nums));
            }
            public static int Lis(int nums[]){
                int ans[]=new int [nums.length];
                Arrays.fill(ans,1);
                for(int i=1;i<ans.length;i++){
                    for(int j=i-1;j>=0;j--){
                        if(nums[j]<nums[i]){
                            int l=ans[j];
                            ans[i]=Math.max(ans[i],l+1);
                        }
                    }
                }
                int max=0;
                for(int i=0;i<ans.length;i++){
                    max=Math.max(max,ans[i]);
                }
                return max;
            }
        }