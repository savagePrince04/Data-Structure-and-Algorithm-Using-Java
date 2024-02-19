package Lec2;

public class SubSequence {
    public static void main(String[] args) {
        String str="abc";
        String ans="";
        PrintSub(str,ans);
    }
    public static void PrintSub(String str,String ans){
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        char ch=str.charAt(0);
        PrintSub(str.substring(1),ans);
        PrintSub(str.substring(1),ans+ch);
    }
}
