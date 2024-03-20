package Lec21;

public class Check_Palindrom {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String s = "nayan";
        System.out.println(IsPalindrom(s));
    }

    public static boolean IsPalindrom(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;

    }
}
