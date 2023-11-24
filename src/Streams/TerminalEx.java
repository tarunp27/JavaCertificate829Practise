package Streams;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class TerminalEx {
    public static void main(String[] args) {
        Stream<String> s1 = Stream.of("monkey", "donkey", "gorrila", "bonobo");
        long i1 = s1.count();
       // long i2 = s1.count();   //exception cause it has been terminated // illegal Stream Exception
        System.out.println(i1);
       // System.out.println(i2);

        //------------------------------------------------------------------------------------------------
        Stream<String> s2 = Stream.of("monkey", "donkey", "gorrila", "bonobo");
        Optional<String> min = s2.min((a,b) -> a.length()-b.length());
        min.ifPresent(x-> System.out.println(x));

        //------------------------------------------------------------------------------------------------------
        Stream<String> s3 = Stream.of("monkey", "donkey", "gorrila", "bonobo");
        Stream<String> infinite = Stream.generate(() -> "chimp");

        Optional<String> resultStr= s3.findAny();
        resultStr.ifPresent((x) -> System.out.println(x));

        infinite.findAny().ifPresent(x-> System.out.println(x));
        //------------------------------------------------------------------------------------------------------

//        Stream<String> infinite2 = Stream.generate(() -> "chimp");      //infinte Stream
//        infinite2.forEach(x-> System.out.println(x));

        //------------------------------------------------------------------------------------------------------

        var list = List.of("monkey","2","chimp");
        Stream<String>  infinite3 = Stream.generate(()-> "chimp");
        Predicate<String> pred = x -> Character.isLetter(x.charAt(0));

        System.out.println(list.stream().anyMatch(pred));
        System.out.println(list.stream().allMatch(pred));
        System.out.println(list.stream().noneMatch(pred));
        System.out.println(infinite3.anyMatch(pred));

        //---------------------------------------------------------------------------------------------------------

        Stream<String> s4 = Stream.of("W","O","L","F");
        String word = s4.reduce("$",(a,b) -> a+b);      //$ is initial value
        System.out.println(word);

        //----------------------------------------------------------------------------------------------------------
    }
}
