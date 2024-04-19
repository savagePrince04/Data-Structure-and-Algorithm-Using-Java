package Lec38;

public class Right_Angled_Triangle_Pattern {
    public static void main(String[] args) {
        int n=5;
        for(int row=0;row<n;row++){
            for(int star=0;star<=row;star++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
