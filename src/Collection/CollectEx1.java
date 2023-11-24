package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CollectEx1 {
    public static void main(String[] args) {
        Collection<String> birds = new ArrayList<>();

        birds.add("Hawk");
        birds.add("Sparrow");
        birds.add("Hawk");
        birds.add("Eagle");
        birds.add("Turkey");

        System.out.println(birds);
        System.out.println(birds.remove("Hawk"));
        //System.out.println(birds.remove(0));
        System.out.println(birds);

        for(String bird : birds){
            System.out.println(bird);
        }

//        for(String bird1 : birds){
//            birds.remove(bird1);       /concurrent modification not possible
//        }

        List<Integer> animals = new CopyOnWriteArrayList<>(List.of(4,3,2));
        for (var n :animals){
            System.out.println(n+" ");
            animals.add(9);
        }
        System.out.println(animals);
        System.out.println("Size " + animals.size());
        //...................................................................................

        //Remove if method with predicate
        Collection<String> reptiles = new ArrayList<>();
        reptiles.add("snake");
        reptiles.add("lizard");
        reptiles.add("crocodile");

        System.out.println(reptiles);
        reptiles.removeIf(s -> s.startsWith("c"));
        System.out.println(reptiles);
    }
}
