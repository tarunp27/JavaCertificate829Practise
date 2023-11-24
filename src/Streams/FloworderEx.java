package Streams;

import com.sun.source.doctree.SeeTree;

import java.util.stream.Stream;

public class FloworderEx {
    public static void main(String[] args) {
        Stream<Integer> s = Stream.iterate(1,n->n+1);
                 s.filter(x -> x==10)
                         .limit(1)
                         .sorted()
                         .forEach(System.out::println);
    }
}
