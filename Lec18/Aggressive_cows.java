package Lec18;

import java.util.Arrays;
import java.util.Scanner;

public class Aggressive_cows {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();// number of stall
            int c = sc.nextInt();// number of cows
            int[] stall = new int[n];
            for (int i = 0; i < stall.length; i++) {
                stall[i] = sc.nextInt();// stall ki position wali input
            }
            Arrays.sort(stall);// sort kr diya Array ko
            System.out.println(largest_mini_dis(stall, c));
            t--;
        }

    }

    public static int largest_mini_dis(int[] stall, int c) {
        //  search space
        int lo = 0; 
        int hi = stall[stall.length - 1] - stall[0]; // stall.length-1
        int ans = 0;
        while (lo <= hi) {
            // here mid represent minimum possible distance between two cow
            int mid = (lo + hi) / 2;
             // is it is possible to place all the cows atleast mid distance apart
            if (isitpossible(stall, c, mid) == true) {
                ans = mid;
                // if it is possible then i want to increace the distance further
                lo = mid + 1;
            } else {
                 // if it is not possible to place all the cows atleast mid distance
                // then i need to decreace the mid distance
                hi = mid - 1;
            }

        }
        return ans;
    }

    public static boolean isitpossible(int[] stall, int c, int mid) {
        // TODO Auto-generated method stub
        int cow = 1;
        int pos = stall[0];
        for (int i = 1; i < stall.length; i++) {
            if (stall[i] - pos >= mid) {
                cow++;
                pos = stall[i];
            }
            if (cow == c) {
                return true;
            }
        }
        return false;
    }
}
