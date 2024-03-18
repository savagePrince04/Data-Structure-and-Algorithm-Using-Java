package Lec18;

public class First_Bad_Version {
    public static void main(String[] args) {
        int n=5;
        int ans=firstBadVersion(n);
        System.out.println(ans);
    }
    public static int firstBadVersion(int n) {
        int low=1;
        int high=n;
        int ans=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(isBadVersion(mid)){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
    public static boolean isBadVersion(int data){  // You are given an API bool isBadVersion(version) on leetcode
        return true;
    }
}
