package Streams;

import java.util.List;
import java.util.stream.Stream;

public class PipelineCreation {
    //simplest way to print list of names which is 4 character, sorted and first two names are printed.
    public static void main(String[] args) {
        var list = List.of("Toby","Ana", "Leroy","alex");
        list.stream()
                .filter(n -> n.length()==4)
                .sorted()
                .limit(2)
                .forEach(System.out::println);
        //---------------------------------------------------------------------------------------------------------
        Stream.generate(() -> "Elsa")
                .filter(n -> n.length() == 4)
                .limit(2)
                .sorted()
                .forEach(x-> System.out.println(x));
    }
}
