package Lec21;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Longest_substring {
    public static void main(String[] args) {
    int arr[]={10,10,20,30,40,10,20,30};
    HashMap<Integer,Integer> map=new HashMap<>();
    for(int num:arr){
        if(map.containsKey(num)){
            int count=map.get(num);
            map.put(num,count+1);
        }
        else {
            map.put(num,1);
        }
    }
    Set<Integer> set= map.keySet();
    for(int num:set){
        System.out.println(num+" ="+ map.get(num));
    }
    }
}
