package MultiThread.ParallelStrms;


import java.util.List;
import java.util.concurrent.ConcurrentMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Prl_Collect {
    public static void main(String[] args) {
        Stream<String> ohMy = Stream.of("lions","tigers","bears").parallel();
        ConcurrentMap<Integer,String> map =ohMy.collect(Collectors.toConcurrentMap(String::length, k->k,(s1, s2)->s1+","+s2));
        System.out.println(map);
        System.out.println(map.getClass());
        System.out.println(map.getOrDefault(7,"**not found**"));
        System.out.println(map.get(5));
        System.out.println(map.get(7));          //null
        System.out.println("----------------------------------");

//        var ohMy1 = Stream.of("lions", "tigers", "bears").parallel();
//        ConcurrentMap<Integer, List<String>> maps = ohMy1.collect(
//                Collectors.groupingByConcurrent(String::length));
//        System.out.println(maps);
    }
}
