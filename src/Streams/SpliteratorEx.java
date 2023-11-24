package Streams;

import java.util.List;
import java.util.Spliterator;

public class SpliteratorEx {
    public static void main(String[] args) {
        var list = List.of("bird -","bunny-","cat-","dog-","fish-","lamb-","mouse-");
        Spliterator <String> OriBagOfAnimals = list.spliterator();
        //OriBagOfAnimals.forEachRemaining(System.out::print);  // all elements
        System.out.println("-------------------------");

        Spliterator<String> pugalsBag = OriBagOfAnimals.trySplit();
        pugalsBag.forEachRemaining(System.out::println);  //bird- bunny- cat-

        System.out.println("-------------------------");

        Spliterator<String> tarunsBag = OriBagOfAnimals.trySplit();
//        tarunsBag.forEachRemaining(System.out::println);    // dog- fish-

        System.out.println("-------------------------");
        tarunsBag.tryAdvance(System.out::println);    // dog-
        tarunsBag.tryAdvance(System.out::println);    // fish-
        tarunsBag.tryAdvance(System.out::println);    // none. only if available
        tarunsBag.forEachRemaining(System.out::println); //none. only if available

        System.out.println("-------------------------");
        OriBagOfAnimals.forEachRemaining(System.out::println);  // lamb- mouse-


    }
}
