package Inheritance;

//method hiding using static keyword


class Bear{
    public static void eat(){
        System.out.println("Bear is eating");
    }
}
public class Panda extends Bear{
    public static int i =9;
    public static void eat(){
        System.out.println("Panda is eating");
    }

    public static void main(String[] args) {
        Panda pn = new Panda();
        pn.eat();
        System.out.println(pn.i);
    }
}
