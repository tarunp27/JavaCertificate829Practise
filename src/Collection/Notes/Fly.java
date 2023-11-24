package Collection.Notes;

import java.util.*;

public class Fly {
    public static void main(String[] args) {
        Collection<String> birds = new ArrayList<>();
        Queue<String> s = new LinkedList<>();

        birds.add("Hawk");
        birds.add("Hawk");
        birds.add("Hawk");
        System.out.println(birds);

//        for(String b : birds){           //ConcurrentModificationModificationException
//            birds.remove(b);
//        }

       // birds.removeIf(s->s.startsWith("H"));
        System.out.println(birds);
    }
}
