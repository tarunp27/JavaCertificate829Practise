package Classes;
class Primate{
    public boolean hasHair(){
        return true;
    }
}
interface HasTail{
    boolean isTailStripped();
}
public class Lemur extends Primate implements HasTail {
    public boolean isTailStripped(){
        return false;
    }
    public int age = 10;

    public static void main(String[] args) {
        Lemur lemur = new Lemur();
        System.out.println(lemur.age);

        HasTail hasTail =  lemur;
        System.out.println(hasTail.isTailStripped());

        Primate primate = lemur;                       //impicit and upcasting
        //Primate primate = new Primate();              //this will give CCE because primate has become parent object
        System.out.println(primate.hasHair());

        Lemur lemur2 = (Lemur)primate;                  //explicit casting downcasting
    }
}
