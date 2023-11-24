package Wrapper;

import java.util.ArrayList;
import java.util.List;

public class Wrpex1 {
    public static void main(String[] args) {
        List<Integer> nlist = new ArrayList<>();
        nlist.add(10);
        int i = nlist.get(0);
//        Integer [] narray = new Integer[5];  this is a wrapper class initalized to null value, null value cannot be initalized to pimitive int
//        i = narray[0];
    }
}
