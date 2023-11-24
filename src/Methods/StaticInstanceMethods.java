package Methods;

public class StaticInstanceMethods {
    static int age = 10;
    String name = "Tarun";
    public StaticInstanceMethods(){
        this.age = 50;
        this.name="pugal";
    }

    public static void printHello(){
        System.out.println("Hello");
    }
    public static void printAge(){   // static method
        StaticInstanceMethods sim = new StaticInstanceMethods();
        printHello();         // calling static method
        //sim.printWelcome(); // calling instance method - only by using its object.
        System.out.println(age);
    }

    public void printWelcome(){System.out.println("Welcome");
    }

    public void printName(){     // instance method
        printWelcome();   // calling instance method
        printHello();     // calling static method
        System.out.println(name);
    }
}

class AnotherTestClass{
    StaticInstanceMethods sim = new StaticInstanceMethods();
    void printHello2() {
        System.out.println("Hello");
        sim.printWelcome();
        StaticInstanceMethods.printHello();
    }
    static void printWelcome2() {
        StaticInstanceMethods.printHello();
//        sim.printWelcome();
//        System.out.println(sim.name);

        System.out.println("Welcome");
    }
}
