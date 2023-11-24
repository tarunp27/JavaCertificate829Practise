package Generics;

import java.util.ArrayList;
import java.util.List;

public class UnboundGeneric {
    public static void main(String[] args) {
        List<CharSequence> books = new ArrayList<>();
        books.add(new StringBuilder("Tarun"));
        books.add(new StringBuilder("Pugal"));
        books.add(new String("Mala"));
        books.add(new String("Sarvesh"));
//        printList(books);
        List<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(20);
        nums.add(89);
//        printList(nums);
        List<String> slist = new ArrayList<>();
        slist.add("Pugalendi A");
        slist.add("Tarun P");

        List<?> anyList = new ArrayList<String>();

        anyList = books;
        anyList = slist;
        anyList = nums;

        List rawlist = new ArrayList();
        rawlist.add("Pugal");
        rawlist.add(20000);
        rawlist.add(new StringBuilder("SarveshP"));

        anyList = rawlist;

    }

    public static void printList(List<?> list){
        for(Object x : list){
            System.out.println(x);
        }
    }
}

