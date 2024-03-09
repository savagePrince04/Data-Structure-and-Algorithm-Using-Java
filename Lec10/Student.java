package Lec10;
public class Student {
    String name="Sudhakar";
    int age = 23;
    Student(String name,int age){
        this.name=name;
        this.age=age;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age){
       try{
           if(age<0){
               throw new Exception("age can not be negative");
           }
       }
       catch (Exception e){
           System.out.println(e);
         e.printStackTrace();
       }
       finally {
           System.out.println("i m in side finally");
       }
    }
}
