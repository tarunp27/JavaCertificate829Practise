package Streams;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class FlatMapPrimi {
    public static void main(String[] args) {
        var integerList = new ArrayList<Integer>();
        IntStream ints = integerList.stream().flatMapToInt(x -> IntStream.of(x));
    }
}
