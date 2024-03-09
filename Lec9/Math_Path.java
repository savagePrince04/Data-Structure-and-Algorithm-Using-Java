package Lec9;

public class Maze_Path {
    public static void main(String[] args) {
        int m=3;
        int n=3;
    PrintPath(0,0,m-1,n-1,"");
    }
    public static void PrintPath(int cc,int cr,int m,int n,String ans){
        if(cc ==m && cr ==n){
            System.out.println(ans);
        }
        if(cc>m || cr>n){
            return;
        }
        PrintPath(cc+1,cr,m,n,ans+"H");
        PrintPath(cc,cr+1,m,n,ans+"v");
        PrintPath(cc+1,cr+1,m,n,ans+"D");
    }
}
