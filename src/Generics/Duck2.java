package Generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Duck2  {
    private String name;
    private int weight;

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Duck2(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String toString() {
        return name;
    }

    public int compareTo(Duck2 d) {
        return name.compareTo(d.name);
    }

    public static void main(String[] args) {
        Comparator<Duck2> byWeight = new Comparator<Duck2>() {
            public int compare(Duck2 d1, Duck2 d2) {
                return d1.getWeight() - d2.getWeight();
            }
        };
        var ducks = new ArrayList<Duck2>();
        ducks.add(new Duck2("quCK", 7));
        ducks.add(new Duck2("puddls", 8));
       // Collections.sort(ducks);
        //System.out.println(ducks);
        Collections.sort(ducks, byWeight);
        System.out.println(ducks);
    }
}
