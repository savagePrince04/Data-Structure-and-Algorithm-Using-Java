package LEC11;

import java.util.Stack;

public class ConstractPI {
    public static void main(String[] args) {
        String str ="IIIDDDIDI";
        System.out.println(Constract(str));
    }
    public static String Constract(String s){
        int count=1;
        int n= s.length();
        int ans[] = new int[n+1];
        Stack<Integer> sc = new Stack<>();
        for(int i=0;i<=s.length();i++){
            if(i==n || s.charAt(i)=='I'){
                ans[i]=count;
                count++;
                while (!sc.isEmpty()){
                    ans[sc.pop()] = count;
                    count++;
                }
            }
            else {
                sc.push(i);
            }
        }
        String p="";
        for(int i=0;i<ans.length;i++){
            p=p+ans[i];
        }
        return p;
    }
}
