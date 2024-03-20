package Lec22;

public class Student {
    String name="Rahul";
    int age=23;
    Student(String name, int age){
        System.out.println(this);
        System.out.println(name+" "+age);
        System.out.println(this.name+" "+this.age);
        this.name=name;
        this.age=age=age;
        System.out.println(name+" "+age);
    }
}
