package Collection;

import java.util.*;
import java.util.function.Function;

public class IteratorEx {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("Tarun");
        list1.add("Bond");
        list1.add("Pearson");
        list1.add("Jedi");
        list1.add(null);

//        for(String s : list1){
//            System.out.println(s);
//        }
//        Iterator<String> itr = list1.iterator();
//        while (itr.hasNext()){
//            String s = itr.next();
//            System.out.println(s);
//        }
        String h = list1.get(4);
        System.out.println(h);


        NavigableMap<String, String> mymap = new TreeMap<String, String>();
        mymap.put("a", "apple");
        mymap.put("b", "boy");
        mymap.put("c", "cat");
        mymap.put("aa", "apple1");
        mymap.put("bb", "boy1");
        mymap.put("cc", "cat1");
        mymap.pollLastEntry(); //LINE 1
        mymap.pollFirstEntry(); //LINE 2
        NavigableMap<String, String> tailmap = mymap.tailMap("b", true);
        System.out.println(mymap);
        System.out.println(tailmap);
        System.out.println(tailmap.pollFirstEntry());
        System.out.println(mymap.size());

        List list = new ArrayList();
        list.add("a");
        list.add(null);

        List<String> vowels = new ArrayList<String>();
        vowels.add("e");
        vowels.add("a");
        vowels.add("i");
        vowels.add("o");
        vowels.add("u");
        Function<List<String>, List<String>> f = lst -> lst.subList(2, 4);
        f.apply(vowels);
        // so the vowels list value does not change.
        vowels.forEach(System.out::print);   // eaiou



    }
}
