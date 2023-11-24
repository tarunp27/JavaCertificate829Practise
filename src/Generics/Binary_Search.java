package Generics;

import java.util.*;

public class Binary_Search {
    static class Rabbit {
        int id;
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(6, 9, 8, 5, 1);
        //List<Integer> list1 = new ArrayList<>();
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        System.out.println(Collections.binarySearch(list, 6));
        System.out.println(Collections.binarySearch(list, 0));

        var names = Arrays.asList("Fluffy", "Hoppy");
        Comparator<String> c = Comparator.naturalOrder();
        //Collections.sort(names,c);
        var index = Collections.binarySearch(names, "Hoppy", c);
        System.out.println(index);


        Set<Duck> ducks = new TreeSet<>();
        ducks.add(new Duck(null));

        Set<Rabbit> rabbits = new TreeSet<>((s1, s2) -> s1.id - s2.id);
        rabbits.add(new Rabbit());

        List<String> bunnies = new ArrayList<>();
        Set<String> bunny = new HashSet<>();
        bunnies.add("long ear");
        bunnies.add("floppy");
        bunnies.add("hoppy");
        System.out.println(bunnies);
        bunnies.sort((b1, b2) ->
                b1.compareTo(b2));
        //Collections.sort(bunnies);
       // bunny.sort((b1,b2)->b1.compareTo(b2));
        System.out.println(bunnies);
    }
}