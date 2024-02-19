package Lec2;

public class Coin_Toss {
        public static void main(String[] args) {
            int n = 3;
            Toss(n, "");

        }

        public static void Toss(int n, String ans) {
            if (n == 0) {
                System.out.print(ans + " ");
                return;
            }
            Toss(n - 1, ans + "H");
            Toss(n - 1, ans + "T");

        }
    }
