package Classes;
// accessing static variable in child class. you can access by class or object reference.
class  BigCat{
    private static String nickname = "Harry";    // cannot be accessed by the subclass
    protected double size;
    static int age=12;
    static void printHelloFromParent(){
        System.out.println("Hello From Parent");
    }
}

public class Jaguar extends BigCat {
//    static void printHelloFromParent(){
//        System.out.println("Hello From Parent!!!");
//    }
    public static void main(String[] args) {
        //static int age =10;
        Jaguar j = new Jaguar();
        System.out.println(++j.size);
        System.out.println(BigCat.age);    // 12    you can access parents static variable using class reference
        System.out.println(j.age);         // 12    or by object reference
        j.size = j.age * 0.5;
        System.out.println(j.size);        // you can use the static variable in calculation.

        BigCat.printHelloFromParent();     // you can access both by class reference and
        j.printHelloFromParent();          // by object reference
    }
}

