package Generics.New_Gnerics;

import java.util.ArrayList;
import java.util.List;

class Employee{
    public String empName="Pugal";
    public int empNumber=99;
    public int empPhoneNumber=98667879;

    @Override
    public String toString() {
        return "Employee{" +
                "empName='" + empName + '\'' +
                ", empNumber=" + empNumber +
                ", empPhoneNumber=" + empPhoneNumber +
                '}';
    }
}
public class Crate <T,U>{
    private T contents;
    private U name;

    public T getContents() {
        return contents;
    }
    public U getName(){
        return name;
    }

    public Crate(T contents,U name){
        this.contents=contents;
        this.name=name;
    }
    public void packCrate(T contents){
        this.contents=contents;
    }

    public static void main(String[] args) {
        Crate<String,String> cr = new Crate("Hello","Tarun");
        System.out.println(cr.getContents()+" "+cr.getName());

//        Integer name2 = Integer.valueOf("Pugal");
//        System.out.println(name2);

        Employee emp = new Employee();
        Crate<Employee,Employee> employeeCrate = new Crate("Sarvesh","Pugalendi");
        employeeCrate.packCrate(emp);
        Employee NewEmployee = employeeCrate.getContents();
        System.out.println(NewEmployee);
    }
//    public class LongTailAnimal {
//        protected void chew(List<Object> input) {}
//    }
//    public class Anteater extends LongTailAnimal {
//        protected void chew(List<Double> input) {} // DOES NOT COMPILE
//    }
public class Mammal {
    public List<CharSequence> play(List<CharSequence> list) {return null;}
    public CharSequence sleep() {return "Tarun";}
}
//    public class Goat extends Mammal {
//        public List<String> play(List<String> list) { return null;}
//        public String sleep() {return "Pugal";}
//    }
}
