package ArrList;

import java.util.ArrayList;
import java.util.List;

public class ListConv {
    public static void main(String[] args) {
        //Arraylist to Array
        List<String> slist = new ArrayList<>();
        slist.add("Tarun");
        slist.add("Puagl");
        System.out.println(slist);

         Object[] sarray = slist.toArray();
        //System.out.println(sarray);

        //Array to ArrayList
        String[] stringarr = {"Pugal","Tarun","Mala"};
        List<String> listarray = List.of(stringarr);
        System.out.println(listarray);
       // listarray.add("neha");
        //System.out.println(listarray);
    }
}
