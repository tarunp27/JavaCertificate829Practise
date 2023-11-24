package Overloading;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

public class ex3 {
    public static void print(Iterable i){
        System.out.println("Iterable");
    }
    public static void print(CharSequence c){
        System.out.println("CharSequence");
    }
    public static void print(Object o){
        System.out.println("Object");
    }

    public static void main(String[] args) {
        ex3.print("abc");
        ex3.print(new ArrayList<>());
        ex3.print(LocalDate.of(2019, Month.JULY,4));
        ex3.print(10);
    }
}



