package Streams.collectors;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Collectorsex1 {
    public static void main(String[] args) {
        var animals = Stream.of("lion","tiger","bear","fox","panda","rabbit");
        //String result = animals.collect(Collectors.joining("+"));
        //Long result1 = animals.collect(Collectors.counting());
        //Double result2 = animals.collect(Collectors.averagingDouble(String::length));
        //Map<String,Integer> result3 = animals.collect(Collectors.toMap(s->s,String::length));
        //Map<Integer,String> result4 = animals.collect(Collectors.toMap(String::length, k->k,(s1, s2)->s1+","+s2));
        //TreeMap<Integer,String> result5 = animals.collect(Collectors.toMap(String::length, k->k,(s1, s2)->s1+","+s2,TreeMap::new));
        //System.out.println(result5);


        //-------------------------------------------------------------------------------------------------------
        var animal = Stream.of("lion","tiger","bear","fox","panda","rabbit","rat","cat");
        var animal2 = Stream.of("lion","tiger","bear","fox","panda","rabbit","cat","rat");
        TreeMap<Integer, Set<String>> map = animal.collect(
                Collectors.groupingBy(
                        String::length,
                        TreeMap::new,
                        Collectors.toSet()));
        System.out.println(map);
        System.out.println(map.getClass());


        TreeMap<Integer, List<String>> map1 = animal2.collect(
                Collectors.groupingBy(
                        String::length,
                        TreeMap::new,
                        Collectors.toList()));
        System.out.println(map1);
        System.out.println(map.getClass());

        //------------------------------------------------------------------------------------------------------------------

        var animaly = Stream.of("lion","tiger","bear","fox","panda","rabbit","rat","cat");
        Map<Boolean, List<String>> map3 = animaly.collect(
                Collectors.partitioningBy(s ->
                        s.length() <= 5));
        System.out.println(map3);
        System.out.println(map3.getClass());

        //------------------------------------------------------------------------------------------------------------------------

        record Sep(String spaceseparated, String commaseperated){}

        var list =List.of("x","y","z");
        Sep result = list.stream().collect(Collectors.teeing(Collectors.joining(" "),
                Collectors.joining(","),
                (s, c) -> new Sep(s, c)));

        System.out.println(result);
        //System.out.println(result.getClass());
    }
}
