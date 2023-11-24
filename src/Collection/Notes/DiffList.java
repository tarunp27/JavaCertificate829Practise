package Collection.Notes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DiffList {
    public static void main(String[] args) {
        List<String> list0 = new ArrayList<>();
        List<String> list1 = List.of("a","b","c");
        List<String> list2 = Arrays.asList("a","b","c");

        list0.add("llllll");
        System.out.println(list0);
        //list1.add("a");                  RE : UnsupportedOperationException
        System.out.println(list1);
        //list2.add("sssss");              RE : UnsupportedOperationException
        System.out.println(list2);

        list0.set(0,"x");
        System.out.println(list0);
        //list1.set(4,"t");
        System.out.println(list1);

        List rawList = List.of("Pugal",55,'C');
        System.out.println(rawList);
    }
}
