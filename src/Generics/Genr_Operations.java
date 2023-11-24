package Generics;

import java.util.ArrayList;
import java.util.List;

public class Genr_Operations {
    public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();
    list.add(1);
    list.add(2);
    list.add(1);
    System.out.println(list);
    list.remove(1)    ;
    System.out.println(list);
    }
}
