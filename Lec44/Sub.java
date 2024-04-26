package Lec44;

public class Sub {
    public static void main(String[] args) {
        String str = "abc";
        SubSeqnunce(str);

    }

    public static void SubSeqnunce(String str) {
        int n = str.length();
        for (int i = 0; i < (1 << n); i++) {
            Print(str, i);

        }
    }

    private static void Print(String str, int i) {
        int pos = 0;
        while (i > 0) {
            if ((i & 1) != 0) {
                System.out.print(str.charAt(pos));
            }
            pos++;
            i >>= 1;
        }
        System.out.println();

    }
}
