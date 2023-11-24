package NestedClass;

public class Fox {
    public class Den{
        int age = 27;
    }
    public void goHome(){
        new Den();
    }
    public static void visitFriend(){
        //new Den();                                //cannot instantiate directly can be done with outer class
        new Fox().new Den();
    }
}
class Squirrel{
    public void visitFox(){
        //new Den();
        Fox f = new Fox();
        Fox.Den d = f.new Den();
    }
}


