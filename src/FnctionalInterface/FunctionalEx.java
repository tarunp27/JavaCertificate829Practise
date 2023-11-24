package FnctionalInterface;

import java.util.function.*;

public class FunctionalEx {
    public static void main(String[] args) {
        Function<String,Integer> f1 = String::length;
        Function<String,Integer> f2 = (x)->x.length();
        DoubleFunction<Double> i1 = x->x/15;

        System.out.println(i1.apply(1.5));
        System.out.println(f1.apply("Pugalendi"));
        System.out.println(f2.apply("Tarun"));

        BiFunction<String,Integer,String> fx = (x,y)-> "Tarun";

    }
}
