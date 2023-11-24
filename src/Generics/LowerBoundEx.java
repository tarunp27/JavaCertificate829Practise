package Generics;

import java.util.ArrayList;
import java.util.List;

public class LowerBoundEx {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("tweet");

        List<Object> objects   = new ArrayList<Object>(strings);
        addSound(strings);
        addSound(objects);
        System.out.println(objects);
        System.out.println(strings);
    }
    static void addSound(List<? super String> list){
        list.add("quack");
    }
}
