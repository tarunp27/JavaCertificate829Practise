package Generics;
import java.util.*;

public class Duck implements Comparable<Duck>{
    private String name;
    public  Duck(String name){
        this.name=name;
    }
    public String toString(){
        return name;
    }
    public int compareTo(Duck d){
//        System.out.println("Compared to entering "+d.name+ " "+ this.name);
        if (d == null) throw new IllegalArgumentException("Poorly formed duck");

        if (this.name == null && d.name == null) {
            System.out.println("if both null");
        }
        if (this.name == null)
        {
            System.out.println("object name null");
            return -1;
        }
        if (d.name ==  null) {
            System.out.println("input value null");
            return -1;
        }
        System.out.println("Compared to before leaving "+this.name+" "+d.name+" "+name.compareTo(d.name));
        return name.compareTo(d.name);
    }

    public static void main(String[] args) {
        System.out.println("before creating ducks");
        var ducks =  new ArrayList<Duck>();
        System.out.println("after Arraylist cretes");
        ducks.add(new Duck("quack"));
        ducks.add(new Duck("puddles"));
        ducks.add(new Duck("barrow"));
        ducks.add(new Duck("swans"));
        ducks.add(new Duck("arrow"));
        System.out.println("Before sort --->"+ducks );
        Collections.sort(ducks);
        System.out.println(ducks);
    }
}
