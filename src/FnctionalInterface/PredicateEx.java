package FnctionalInterface;

import java.util.function.Predicate;

public class PredicateEx {
    public static void main(String[] args) {

        Predicate<String> p1 = x -> x.isEmpty();

        System.out.println(p1.test(""));
        System.out.println(p1.test("Tarun"));
     }
}
