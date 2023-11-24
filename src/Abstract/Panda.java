package Abstract;

abstract class Bear{                 //class cannot be final
    abstract CharSequence chew();    //method cannot be private
    public Bear(){
        System.out.println(chew());
    }
}

public class Panda extends Bear {
    String chew(){
        return "Yummy";
    }

    public static void main(String[] args) {
        new Panda();
    }
}

//abstarct and static cannot be used
//abstract class Hippo{
//    abstract static void swim();
//}