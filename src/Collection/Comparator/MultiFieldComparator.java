package Collection.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MultiFieldComparator implements Comparator<Squirrel> {
    public int compare(Squirrel s1, Squirrel s2) {
        int result = s1.getSpecies().compareTo(s2.getSpecies());
        if(result!=0) return result;
        return s1.getWeight() - s2.getWeight();
    }



    public static void main(String[] args) {
//        Comparator<Squirrel> c = Comparator.comparing(Squirrel::getSpecies).thenComparingInt(Squirrel::getWeight);
        MultiFieldComparator m = new MultiFieldComparator();
        var sq = new ArrayList<Squirrel>();
        sq.add(new Squirrel(52,"Fox squirrel"));
        sq.add(new Squirrel(33,"Japanese Dwarf"));
        sq.add(new Squirrel(13,"Japanese Dwarf"));
        sq.add(new Squirrel(45,"Siberian Flying"));
        System.out.println(sq);
        Collections.sort(sq,m);
//        Collections.sort(sq,c);   // you can use comaprator object c. (line#17)
        System.out.println(sq);
    }
}
