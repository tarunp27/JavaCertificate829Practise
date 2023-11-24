package Streams;

import java.util.stream.Stream;

public class IntermidiateEx {
    public static void main(String[] args) {
        if(args == null)
        {
            System.out.println("null value");
        }
        else {
            System.out.println("not null");
        }
        //filter method
        Stream<String> s1 = Stream.of("monkey","donkey","gorilla","bonobo","mongoose","mouse");
        s1.filter(x->x.startsWith("m"))
                .forEach(y-> System.out.println(y));
        //------------------------------------------------------------------------------------------------
        //map method creates one o one mapping from the elemnt in the stream to elements of the next step in the stream
        Stream<String> s2 = Stream.of("monkey","donkey","gorilla","bonobo","mongoose","mouse");
//        s2.filter(x->x.startsWith("m"))                   // result Steam is Stream<String>
//                .map(x->x.length())                       // result stream is Stream<integer)
//                .forEach(y-> System.out.print(y));
          s2.map(x->x.length())                              // result Stream is Stream<Integer>
                .filter(x-> x % 2 == 0)                    // result Stream is Stream<Integer>
                .forEach(x -> System.out.println(x));
    }
}
