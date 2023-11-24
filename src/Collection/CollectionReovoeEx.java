package Collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionReovoeEx {
    public static void main(String[] args) {
        Collection <String> list1 = new ArrayList<>();
        list1.add("Tarun");
        list1.add("");
        list1.add("");
        System.out.println(list1);

        list1.removeIf(String::isEmpty);                //removes all emoty elements
        System.out.println(list1);
    }
}
