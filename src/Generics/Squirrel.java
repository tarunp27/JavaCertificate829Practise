package Generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Squirrel {
        private int weight;
        private String species;

    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getSpecies() {
        return species;
    }
    public void setSpecies(String species) {
        this.species = species;
    }

    public Squirrel(int weight, String species) {
        this.weight = weight;
        this.species = species;
    }

    @Override
    public String toString() {
        return "Squirrel{" +
                "species='" + species +
                ", weight=" + weight +'\'' +
                '}'+"\n" ;
    }
}
class MultiFieldComparator  implements Comparator<Squirrel> {
    public int compare(Squirrel s1,Squirrel s2){
        System.out.println("Compare Method");
        int result = s1.getSpecies().compareTo(s2.getSpecies());
        if(result!=0) return result;
        return  s1.getWeight()-s2.getWeight();
    }
    public static void main(String[] args) {
        Squirrel s1 = new Squirrel(10,"sp1");
        Squirrel s2 = new Squirrel(12,"sp2");
        Squirrel s3 = new Squirrel(13,"sp3");
        Squirrel s4 = new Squirrel(9,"sp1");
        Squirrel s5 = new Squirrel(10,"sp2");
        Squirrel s6 = new Squirrel(11,"sp1");
        Squirrel s7 = new Squirrel(5,"sp2");
        Squirrel s8 = new Squirrel(10,"sp4");
        Squirrel s9 = new Squirrel(9,"sp4");

        var squirells = new ArrayList<Squirrel>();
        squirells.add(s1);
        squirells.add(s2);
        squirells.add(s3);
        squirells.add(s4);
        squirells.add(s5);
        squirells.add(s6);
        squirells.add(s7);
        squirells.add(s8);
        squirells.add(s9);

        Comparator<Squirrel> c = Comparator.comparing(Squirrel::getSpecies)
                .thenComparingInt(Squirrel::getWeight).reversed();

//        Collections.sort(squirells, c);

        Collections.sort(squirells,new MultiFieldComparator());

        System.out.println(squirells);
    }
}
