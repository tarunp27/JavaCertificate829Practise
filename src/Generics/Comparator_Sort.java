package Generics;

import java.util.Arrays;
import java.util.Comparator;

public class Comparator_Sort {
    public static void main(String[] args) {
        Integer[] blk = new Integer[]{5,3,2,6,8,10,1};
        Comparator<Integer> comp =(a, b)->{
            System.out.println(Arrays.toString(blk)+" comparing "+a+" and "+b);
            return a.compareTo(b);
        };
        Arrays.sort(blk,comp);
        System.out.println(Arrays.toString(blk));
    }
}
