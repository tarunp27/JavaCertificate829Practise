package Classes;

import java.util.ArrayList;
import java.util.List;

public class DomesticAnimal {
    static
    {
        System.out.println("public block pet animal");
    }
    public static void main(String[] args) {
        cat c = new cat(12);
        final List<String> l1 = new ArrayList<>();
        List<String> l2 = new ArrayList<>();
        l1.add("pugal");
        l2.add("tarun");
        //l1=l2;
        System.out.println(l1);
        System.out.println(l2);

         StringBuilder sb1 = new StringBuilder("TARUN");
        StringBuilder sb2 = new StringBuilder("PUGAL ");

        sb1.append("tarun pugal") ;
        sb1 = sb2;

        final String s1 ="Pugal";
        String s2 = "A";
        s1.concat(s2);
        System.out.println(s1);


    }
}

class cat extends petanimal{
    static int count;
    int age ;
    static
    {
        System.out.println("static block cat animal");
    }
    public cat(){
        super(45);
    }
    public cat(int age){
        this();
        //count =22;
        //super(4);
        this.age=age;
    }
}
    class petanimal{
    final int age ;
    final static int height;
    static
    {
        height=10;
        System.out.println("static block pet animal");
    }
    //    public petanimal(){
//        System.out.println("default c");
//    }
    public petanimal(int age){

        this.age = age;
    }
}
