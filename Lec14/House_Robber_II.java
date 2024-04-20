package Lec14;public class House_Robber_II {
    public static void main(String[] args) {
            int nums[]={1,2,3,1};
                if(nums.length<2){
                    System.out.println(nums[0]);;
                }
                int include_first[]=new int[nums.length-1];
                int include_last[]=new int [nums.length-1];
                for(int i=0;i<nums.length-1;i++){
                    include_first[i]=nums[i];
                    include_last[i]=nums[i+1];
                }
                int RobFirst=rob1(include_first);
                int RobLast=rob1(include_last);
                int ans= Math.max(RobFirst,RobLast);
                 System.out.println(ans);
            }
            public static int rob1(int[] nums) {
                return Robber(nums);
            }
            public static int Robber(int nums[]){
                if(nums.length==1){
                    return nums[0];
                }
                int dp[]=new int[nums.length];
                dp[0]=nums[0];
                dp[1]=Math.max(nums[0],nums[1]);
                for(int i=2;i<dp.length;i++){
                    int rob=nums[i]+dp[i-2];
                    int Dont_rob=dp[i-1];
                    dp[i]=Math.max(rob,Dont_rob);
                }
                return dp[dp.length-1];
            }
        }


//class Solution {
//    public int rob(int[] nums) {
//        if(nums.length<2){
//            return nums[0];
//        }
//        int include_first[]=new int[nums.length-1];
//        int include_last[]=new int [nums.length-1];
//        for(int i=0;i<nums.length-1;i++){
//            include_first[i]=nums[i];
//            include_last[i]=nums[i+1];
//        }
//        int RobFirst=rob1(include_first);
//        int RobLast=rob1(include_last);
//        return Math.max(RobFirst,RobLast);
//    }
//    public int rob1(int[] nums) {
//        return Robber(nums);
//    }
//    public static int Robber(int nums[]){
//        if(nums.length==1){
//            return nums[0];
//        }
//        int dp[]=new int[nums.length];
//        dp[0]=nums[0];
//        dp[1]=Math.max(nums[0],nums[1]);
//        for(int i=2;i<dp.length;i++){
//            int rob=nums[i]+dp[i-2];
//            int Dont_rob=dp[i-1];
//            dp[i]=Math.max(rob,Dont_rob);
//        }
//        return dp[dp.length-1];
//    }
//}