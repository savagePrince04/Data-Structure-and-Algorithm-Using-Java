package Lec20;

public class feq {
    public static void main(String[] args) {
        String s="abcabcabs";
        int feq[]= new int[256];
        for(int i=0;i<s.length();i++){
            feq[s.charAt(i)]++;
        }

        for(int i=0;i<s.length();i++){
            if(feq[s.charAt(i)]>0) {
                System.out.println(s.charAt(i) + "=" + feq[s.charAt(i)]);
                feq[s.charAt(i)] = 0;
            }
        }
    }
}
