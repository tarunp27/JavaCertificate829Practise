package Generics;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Coll_Excercise {
    public static void main(String[] args) {
        Integer[] array = new Integer[]{1,2,3,4};

        List<Integer> list1 = Arrays.asList(array);
        List<Integer> list2 = List.of(1,2,3,4);
        List<Integer> list3 = new ArrayList<>();
        list3.add(1);
        list3.add(2);
        list3.add(3);

        List<Integer> list4 = List.copyOf(list1);
        List<Integer> list5 = List.copyOf(list2);
        List<Integer> list6 = List.copyOf(list3);
//        list4.add(1);
//        list5.add(2);
//        list6.add(3);

        // list1.set(0,9);
        var list7 = new ArrayList<>();
        list7.add("Tarun");
        list7.add(Integer.valueOf(1000));
        for(Object o : list7){           //if we put string or integer itll give error4
            System.out.println(o);
        }
        List<String> slist = new ArrayList<>();
        slist.add("Tarun");
        slist.add("Pugal");
        slist.add("Mala");
        Integer i = 2;
        int is = 0;
        System.out.println(slist.remove(i));
        System.out.println(slist.remove(is));
        System.out.println(slist);
        Object[] sArray = slist.toArray();

    }
    //public default void play(){}
}
