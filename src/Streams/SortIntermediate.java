package Streams;

import java.util.Comparator;
import java.util.stream.Stream;

public class SortIntermediate {
    public static void main(String[] args) {
        Stream<String> s = Stream.of("brown-","bear-");
        s.sorted().forEach(System.out::println);

        Stream<String> s1 = Stream.of("brown bear-","grizzly-");
        s1.sorted().forEach(System.out::println);

        Stream<String> s2 = Stream.of("brown bear-","grizzly-");
       // s2.sorted().forEach(Comparator::reverseOrder); reverseOrder is a supplier
    }
}
