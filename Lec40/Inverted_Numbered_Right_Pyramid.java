package Lec40;

public class Inverted_Numbered_Right_Pyramid {
    public static void main(String[] args) {
        int n=3;
        for(int row=1;row<=n;row++){
            for(int col=1;col<=n-row+1;col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
}
