package Generics;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class Map_Merge {
    public static void main(String[] args) {
        BiFunction<String, String, String> mapper = (v1, v2) ->
        v1.length()> v2.length() ? v1: v2;
        Map<String,String> favourites = new HashMap<>();
        favourites.put("Sam",null);
        favourites.merge("Tom","Skyride",mapper);
        favourites.merge("Sam","Skyride",mapper);
        System.out.println(favourites);
    }
}
