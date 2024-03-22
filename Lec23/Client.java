package Lec23;

public class Client extends Object {
    public static void main(String[] args) {

        B sc = new B();
        sc.fun1();
        sc.fun2();
        System.out.println(((B) (sc)).a);
    }

}
