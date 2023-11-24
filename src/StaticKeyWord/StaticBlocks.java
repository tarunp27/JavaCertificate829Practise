package StaticKeyWord;
// static blocks can use only static variables
// instance blocks can use both static and instance variables.
public class StaticBlocks {
    public static int counter1;
    public int age;

    StaticBlocks() {
        System.out.println("Constructor runs.");
    }

    static {
        System.out.println("Static block executed");
        counter1 = 10;
        //age = 50;
        System.out.println(counter1+" ");
    }

    {
        System.out.println("Static block executed");
        counter1 = 100;
        age = 55;
        System.out.println(counter1+" ");
    }


    public static void main(String[] args) {
        System.out.println("I am going to instantiate StaticBlocks");
        new StaticBlocks();
    }
}
