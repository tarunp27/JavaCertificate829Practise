package Collection.Comparator;

import NestedClass.A;

public class Animal implements Comparable<Animal>{
    private int id;
    public int compareTo(Animal a){
        return id - a.id;
    }

    public static void main(String[] args) {
        var a1 = new Animal();
        var a2 = new Animal();
        var a3 = new Animal();

        a1.id = 3;
        a2.id= 5;
        a3.id=7;

        System.out.println(a1.compareTo(a2));
        System.out.println(a2.compareTo(a3));
        System.out.println(a1.compareTo(a1));
        System.out.println(a3.compareTo(a1));
    }
}
