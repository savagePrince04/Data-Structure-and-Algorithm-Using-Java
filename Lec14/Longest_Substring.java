package Lec14;

import java.util.HashSet;

public class Longest_Substring {
    public static void main(String[] args) {
        HashSet<Character> set = new HashSet<>();
        String s = "pwwkew";
        int ans=LongestSubString(s,set);
        System.out.println(ans);
    }

    public static int LongestSubString(String s,HashSet<Character>set) {
        int si = 0;
        int ei = 0;
        int max = 0;
        while (ei < s.length()) {
            if (!set.contains(s.charAt(ei))) {
                set.add(s.charAt(ei));
                ei++;
                max = Math.max(max, set.size());
            } else {
                set.remove(s.charAt(si));
                si++;
            }
        }
        return max;
    }
}