package Classes;

import com.mysql.cj.exceptions.StreamingNotifiable;

public class Hamster {
    String color;
    int weight;
    public Hamster(){
        System.out.println("Default constructor");
    }
    public Hamster(int weight){
        this();
        System.out.println("First Constructor");
    }
    public Hamster(int weight,String color){
        this(20);
        System.out.println("Second Constructor");
    }

    public static void main(String[] args) {
        Hamster h1 = new Hamster();
       // Hamster h2 = new Hamster(20);
        Hamster h3 = new Hamster(45,"yellow");
        ptrName("tarun");
    }
    public static void ptrName(String... args){
        //System.out.println(args[0]);
        if(args==null){
            System.out.println("Nullvalue");
        }
        else{
            System.out.println("notnull");
        }
    }
}
