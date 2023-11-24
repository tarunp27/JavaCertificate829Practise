package Streams;
import java.util.List;
import java.util.stream.Stream;

public class InfinteStreamEx {
    public static void main(String[] args) {

        //Stream<Double> randoms = Stream.generate(Math::random).limit(1);
        //radnoms.forEach(x-> System.out.println(x));
        //System.out.println(randoms);

//        Stream<Integer> oddNumbers = Stream.iterate(1, n -> n + 2).limit(10);
//        oddNumbers.forEach(x-> System.out.println(x));
//        System.out.println(oddNumbers);

        Stream<Integer> oddNumbers = Stream.iterate(1,s->s<10, n -> n + 2);
        oddNumbers.forEach(x-> System.out.println(x));
        System.out.println(oddNumbers);

//        var list = List.of("a","b","c","d","e","f","g");
//        Stream <String> sList =list.parallelStream();
//        sList.forEach(x-> System.out.println(x));

        var list = List.of("a","b","c","d","e","f","g");
        Stream <String> sList =list.parallelStream();
        sList.forEach(x-> System.out.println(x));
    }
}
