package Lec7;

import java.util.*;
public class Key_paid {
    static String map[]={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public static void main(String[] args) {
        List<String> ll = new ArrayList<>();
        String num ="23";
        Combination(num,"",ll);
        System.out.println(ll);
    }
    public static void Combination(String ques,String ans,List<String> ll){
        if(ques.length()==0){
            //System.out.println(ans);
            ll.add(ans);
            return;
        }
        char ch = ques.charAt(0);
        int num = ch-'0';
        String Press = map[num];
        for(int i=0;i<Press.length();i++){
            Combination(ques.substring(1), ans+Press.charAt(i),ll);
        }
    }
}
