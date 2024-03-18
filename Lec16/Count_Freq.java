package Lec16;

import java.util.HashMap;
import java.util.Set;

public class Count_Freq {
    public static void main(String[] args) {
        String str="abcabcabc";
        Count(str);
    }
    public static void Count(String str){
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<str.length();i++){
            if (map.containsKey(str.charAt(i))){
                int count=map.get(str.charAt(i));
                map.put(str.charAt(i),count+1);
            }
            else{
                map.put(str.charAt(i),1);
            }
        }
        System.out.println(map.values());
        Set<Character> set=map.keySet();
        for(char num:set){
            System.out.println(num+"="+map.get(num));
        }
    }
}
