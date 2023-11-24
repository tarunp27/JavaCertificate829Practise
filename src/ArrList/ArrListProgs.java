package ArrList;

import org.w3c.dom.ls.LSInput;

import java.util.ArrayList;
import java.util.List;

public class ArrListProgs {
    public static void main(String[] args) {
//        ArrayList list = new ArrayList();
//        list.add("Tarun");
//        list.add(Boolean.TRUE);
//        System.out.println(list);

        List<Integer> nlist = new ArrayList<>();
        List<Integer> newlist = new ArrayList<>();
        nlist.add(3);
        nlist.add(6);
        nlist.add(8);
        nlist.add(11);
        System.out.println(nlist);

        nlist.remove(2);
        //System.out.println(nlist.remove(2));
        System.out.println(nlist);

        nlist.remove(Integer.valueOf(11));
        System.out.println(nlist);

        //boolean bo =nlist.contains(3);
        //System.out.println(bo);

        nlist = newlist;
        System.out.println(nlist.equals(newlist));
    }
}
