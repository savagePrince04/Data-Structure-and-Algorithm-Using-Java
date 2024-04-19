package Lec38;

public class Rectangular_Star_Pattern {
    public static void main(String[] args) {
        int n=5;
        for(int row=0;row<n;row++){
            for(int star=0;star<n;star++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
