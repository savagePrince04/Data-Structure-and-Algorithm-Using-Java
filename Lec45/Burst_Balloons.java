package Lec45;
public class Burst_Balloons {
    public static void main(String[] args) {
        int nums[] = {3, 1, 5, 8};
        Integer dp[][] = new Integer[nums.length][nums.length];
        int n = nums.length;
        int ans = solve(nums, 0, nums.length - 1, dp, n);
        System.out.println(ans);
    }
    public static int solve(int a[], int i, int j, Integer dp[][], int n) {
        if (i > j)
            return 0;
        if (dp[i][j] != null)
            return dp[i][j];
        for (int k = i; k <= j; k++) {
            int left = (i - 1 < 0) ? 1 : a[i - 1];
            int right = (j + 1 >= n) ? 1 : a[j + 1];
            int temp = left * a[k] * right;
            temp += solve(a, i, k - 1, dp, n) + solve(a, k + 1, j, dp, n);
            dp[i][j] = Math.max(dp[i][j] == null ? 0 : dp[i][j], temp);
        }
        return dp[i][j];
    }
}
