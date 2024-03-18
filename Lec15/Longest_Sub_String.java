package Lec15;

import java.util.HashSet;
import java.util.Set;

public class Longest_Sub_String {
    public static void main(String[] args) {
        Set<Integer> set= new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(10);
        set.add(20);
        System.out.println(set.size());
        set.remove(30);
        System.out.println(set.contains(20));
        System.out.println(set);
        for(int num:set){
            System.out.println(num);
        }
    }
}
