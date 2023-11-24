package FnctionalInterface;

import java.util.function.Consumer;

public class ConsumerEx {
    public static void main(String[] args) {

        Consumer<String> c1 = x-> System.out.println(x);

        c1.accept("Tarun HEloo!");
    }
}
