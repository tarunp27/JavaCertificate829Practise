package Inheritance;

public class Bird {
    public final boolean hasFetahers(){
        return true;                       // overriding happens only for methods not for variables
    }
    public static final void fly(){}
}
class Penguin extends Bird{
//    public final boolean hasFetahers(){
//        return false;                        Final method overrriding not possible, arent method should not be final
//    }
//    public static void fly(){}
}
