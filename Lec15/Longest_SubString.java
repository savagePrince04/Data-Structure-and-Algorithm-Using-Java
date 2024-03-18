package Lec15;

import java.util.HashMap;
import java.util.HashSet;

public class Longest_SubString {
    public static void main(String[] args) {
        String str="abcabcbb";
        LongCont(str);
    }
    public static void LongCont(String s){
        HashSet<Character> set=new HashSet<>();
        int si=0;
        int ei=0;
        int ans=0;
        while (ei<s.length()){
            if(!set.contains(s.charAt(ei))){
                set.add(s.charAt(ei));
                ans=Math.max(ans, set.size());
                ei++;
            }
            else {
                set.remove(s.charAt(si));
                si++;
            }
        }
        System.out.println(ans);
    }
}
