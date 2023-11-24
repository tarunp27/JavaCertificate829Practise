package Generics;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class UpperboundGeneric {
    public static void main(String[] args) {
        // ArrayList<Number> list = new ArrayList<Integer>();
        List<Integer> list = new ArrayList<Integer>();
        list.add(22);
        list.add(23);
        list.add(74);
        long result = total(list);
        System.out.println(result);

        List<Long> flist = new ArrayList<Long>();
        flist.add(2000L);
        flist.add(3000L);
        result = total(flist);
        System.out.println(result);

        List<Object> olist = new ArrayList<>();
        olist.add(123);
        olist.add(123);
//        result = total(olist);   // Number is the upper bound you cannot use objects above Number.

        List<? extends Number> reslist = new ArrayList<>();
        //reslist.add(Integer.valueOf(4));  // you cannot add any object.
        reslist = flist;
        reslist = list;
//        reslist = olist;

        List<? super Number> lowerlist = new ArrayList<>();
        Integer wrapperint = 50;
        Object objint = 55;
        Number num = 125;
        lowerlist.add(5);
        lowerlist.add(wrapperint);
       // lowerlist.add(objint);
        lowerlist.add(num);

        Object x = 10, y= 20, z = 30;
        List<Object> objlist = new ArrayList<>();
        objlist.add(x);
        objlist.add(y);
        objlist.add(z);

        Number nx = Integer.valueOf(10);
        Number ny = Integer.valueOf(20);
        Number nz = Integer.valueOf(30);

        List<Number> numList = new ArrayList<>();
        numList.add(nx);
        numList.add(ny);
        numList.add(nz);

        List<Integer> IntList = new ArrayList<>();
        IntList.add(10);
        IntList.add(20);

        lowerlist = objlist;    // lower bound is NUmber, so object is fine
        lowerlist = numList;    // lower bound is NUmber, so Number is fine
        //lowerlist = IntList;  // lower bound is NUmber, so Integer is not okay. below Number object not allowed.

    }
    public static long total (List<? extends Number> list){
        long count = 0;
        for(Number number : list){
            count += number.longValue();
        }
        return count;
    }
}
