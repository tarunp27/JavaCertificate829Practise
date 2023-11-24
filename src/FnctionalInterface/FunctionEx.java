package FnctionalInterface;

import java.util.function.Function;

public class FunctionEx {
    public static void main(String[] args) {
        Function<String,Integer> f1 = x-> x.length();

        System.out.println(f1.apply("tarun pugalendi"));
        System.out.println(f1.apply("tarun"));
    }
}
