package Lec16;

public class Longest_Common_Subsequence_BU {
    public static void main(String[] args) {
        String text1="abc";
        String text2="abc";
        int ans=lcsBU(text1,text2);
        System.out.println(ans);
            }
            public static int lcsBU(String s1, String s2) {
                int[][] dp = new int[s1.length() + 1][s2.length() + 1];
                for (int i = 1; i < dp.length; i++) {
                    for (int j = 1; j < dp[0].length; j++) {
                        if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                            dp[i][j] = 1 + dp[i - 1][j - 1];
                        } else {
                            int f = dp[i - 1][j];
                            int s = dp[i][j - 1];
                            dp[i][j] = Math.max(f, s);
                        }
                    }
                }
                return dp[dp.length - 1][dp[0].length - 1];

            }
        }
