package FnctionalInterface;

import java.util.Locale;
import java.util.function.UnaryOperator;

public class UnaryOp {
    public static void main(String[] args) {

        UnaryOperator<String> u1 = x -> x.toUpperCase();
        System.out.println(u1.apply("tarun"));
    }
}
