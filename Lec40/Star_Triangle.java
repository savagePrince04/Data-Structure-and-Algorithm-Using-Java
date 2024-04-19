package Lec40;

public class Star_Triangle {
    public static void main(String[] args) {
        int n=3;
        for(int row=0;row<=n;row++){
            for(int space=0;space<=n-row;space++){
                System.out.print(" ");
            }
            for(int star=0;star<2*row-1;star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
