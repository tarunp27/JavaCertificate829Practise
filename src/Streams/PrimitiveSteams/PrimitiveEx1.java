package Streams.PrimitiveSteams;

import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrimitiveEx1 {
    public static void main(String[] args) {
        //coverting stream tp primitve stream
        Stream<Integer> s1 = Stream.of(1,2,3,4);
        System.out.println(s1.mapToInt(x->x).sum());

        //creating primitive stream
        IntStream is = IntStream.of(1,2,3,4);
        OptionalDouble avg = is.average();
        System.out.println(avg.getAsDouble());

        String s = """ 
                        Tarun
                        Hsr Layout
                        Bangalore 560102
                """;
        System.out.println(s);
    }
}
