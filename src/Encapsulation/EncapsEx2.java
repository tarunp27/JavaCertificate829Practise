package Encapsulation;

import com.sun.nio.sctp.AbstractNotificationHandler;

public class EncapsEx2 {
    public static void main(String[] args) {
        Employee e1 = new Employee("Tarun P",26);
        Employee e2 = new Employee("Sarvesh P", 21);
        System.out.println(e1.GetAge()+ " "+ e1.GetName());
        System.out.println(e2.GetAge()+ " "+ e2.GetName());
    }
}
class Employee {
    private String name ;//read only class
    private int age;

    public Employee(String name, int age){
        this.name = name;
        this.age= age;
    }
    public String GetName(){
        return name;
    }
    public int GetAge(){
        return age;
    }
}
