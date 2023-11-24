package Inheritance;

//implicit ,explicit casting objects example


class Primate{
    public boolean hasHair(){
        return true;
    }
}
interface HasTail{
    public abstract boolean isStyleStripped();
}
public class Lemur extends Primate implements HasTail{
    public boolean isStyleStripped(){
        return false;
    }
    public int age = 10;

    public static void main(String[] args) {
        Lemur lemur = new Lemur();
        System.out.println(lemur.age);

        HasTail hasTail =lemur;
        System.out.println(hasTail.isStyleStripped());

        Primate p1 = new Primate();
        System.out.println(p1.hasHair());

        Primate p2 = new Lemur();// implicit casting

       // Lemur l3 = (Lemur)p1; // explicit casting  classCastException   p1(parent and child object) will not run but p2 will run because it has child object
       // System.out.println(l3.age);

        System.out.println(p1 instanceof Lemur);

        System.out.println(p2 instanceof Primate);

        System.out.println(p2 instanceof Lemur);
    }
}
