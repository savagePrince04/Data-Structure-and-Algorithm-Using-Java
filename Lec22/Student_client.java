package Lec22;
public class Student_client {
    public static void main(String[] args) {
        Student sc = new Student("Raman",25);
        System.out.println(sc);
        System.out.println("I am inside main");
    }
    static {
        System.out.println("i am inside static");
    }
}
