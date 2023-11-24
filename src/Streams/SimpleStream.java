package Streams;

import java.util.List;
import java.util.stream.Stream;

public class SimpleStream {
    Stream<String> empty = Stream.empty();
    Stream<Integer> singleValue = Stream.of(1);
    Stream<Integer> fromArray = Stream.of(1, 2, 3, 4);

    public static void main(String[] args) {
        var list = List.of("a", "b", "c");
        Stream<String> fromList = list.stream();

        System.out.println(list);
        System.out.println(fromList);
    }
}
