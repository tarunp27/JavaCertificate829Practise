package Classes.Immutable1;

import java.util.ArrayList;
import java.util.List;
//immutable using deep copy returning copyObject ,its gives the reference of the copy object
public final class Animal {
    private final ArrayList<String> favouriteFoods;
    private final int age ;

    public Animal() {
        this.favouriteFoods = new ArrayList<>();
        this.favouriteFoods.add("apples");
        this.age = 25;
    }
    public List<String> getfavFoods(){
//        return favouriteFoods;
        var copyFood = new ArrayList<String>(this.favouriteFoods);
        return copyFood;
    }
    public int getAge(){
        return age;
    }
}
class AnimalMain{
    public static void main(String[] args) {
        var Zebra = new Animal();
        System.out.println(Zebra.getfavFoods());
        System.out.println(Zebra.getAge());
        System.out.println("After modification");
        List<String> food = Zebra.getfavFoods();
        food.add("Bad apples");
        int age = Zebra.getAge();
        age = 50;
        System.out.println(Zebra.getfavFoods());
        System.out.println(Zebra.getAge());
    }
}
