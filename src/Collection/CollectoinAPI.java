package Collection;

import java.util.ArrayList;
import java.util.List;

public class CollectoinAPI {
    public static void main(String[] args) {
        var list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println(list);

        //Integer x = 3;
       // list.remove(Integer.valueOf(3));             //Wrapper class variables
        list.remove(Integer.parseInt("2"));         //  primitive class variables
        System.out.println(list);
    }
}
