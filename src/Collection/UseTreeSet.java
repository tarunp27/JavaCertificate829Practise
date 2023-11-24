package Collection;

import Generics.Duck;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class UseTreeSet {
    static class Rabbit  {int id;}

    public static void main(String[] args) {
        Set<Duck> ducks  = new TreeSet<>();
        ducks.add(new Duck("Puddles"));


        Set<Rabbit> rabbits = new TreeSet<>((r1,r2) -> r1.id - r2.id);
        rabbits.add(new Rabbit());

        List<Object> list3 = new ArrayList<>();
        List<Object> obj1 = list3;

        List<? super IOException> exceptions = new ArrayList<Exception>();
        //exceptions.add(new Exception());
    }
}
