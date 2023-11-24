package Generics;

import java.util.HashMap;
import java.util.Map;

public class MapEx {
    public static void main(String[] args) {
        Map<Integer,String> map1=Map.of(1,"Tarun",2,"Sarvesh");
        Map<Integer,String> map2 = new HashMap<>();
        map2.put(1,"Tarun");
        map2.put(2,"Sarvesh");
        map2.put(3,"Neha");
        System.out.println();
        map2.values().forEach(System.out::println);
        map1.entrySet().forEach(e-> System.out.println(e.getKey()+":"+e.getValue()));
        map1.entrySet().forEach(System.out::println);

        System.out.println("1 is"+ map2.get(1));
        System.out.println("Default is "+map2.getOrDefault(4,"Tba"));
        map2.put(3,"MalaX");
        map2.put(4,"Mala");
        map2.putIfAbsent(5,"Pugal");

        System.out.println(map2);
        System.out.println(map2.put(4,"MalaP"));           //Mala
        System.out.println(map2.putIfAbsent(4,"MalaP"));   //MalaP
        System.out.println(map2.put(6,"Agila"));           //null
        System.out.println(map2.putIfAbsent(6,"Agila"));   //Agila

    }
}
