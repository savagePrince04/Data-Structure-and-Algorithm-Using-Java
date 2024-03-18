package Lec17;

public class KthRoot_Linear {
    public static void main(String[] args) {
        int n=150;
        int k=3;
        KthRoot(n,k);
    }
    public static void KthRoot(int n,int k){
        int ans=0;
        for(int x=0;x<n;x++){
            if(Math.pow(x,k)<=n){
                ans=x;
            }
        }
        System.out.println(ans);
    }
}
