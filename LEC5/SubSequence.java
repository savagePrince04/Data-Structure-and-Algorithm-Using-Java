package LEC5;

public class SubSequence {
    public static void main(String[] args) {
        String str="abc";
        String ans="";
        Sub(str,ans);
    }
    public static void Sub(String str,String ans){
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        char ch = str.charAt(0);
        Sub(str.substring(1),ans);
        Sub(str.substring(1), ans+ch);
    }
}
