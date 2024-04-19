package Lec38;

public class Right_Angled_Number_Pyramid {
    public static void main(String[] args) {
        int n=5;
        for(int row=1;row<=n;row++){
            for(int star=1;star<=row;star++){
                System.out.print(star+" ");
            }
            System.out.println();
        }
    }
}
