package Overloading;

public class Bird {
    public void fly(){
        System.out.println("No parameters 1");
    }
    public void fly(int speed){
        System.out.println("With parameter int 2");
    }
    public void fly(short speed){
        System.out.println("With paramter short 3");
    }
    public void fly(short speed , int height){}
    public void fly(int height,short speed){}
    public void fly(int speed,int height){
        System.out.println("With two int parameters");
    }
    public void fly(int[] lengths){}
   // public void fly(int...lengths){}//duplicate varargs
    //void fly(){};duplicate statement.

   // boolean fly(int height){   duplicate int
        //return false;
   // }
}
class main {
    public static void main(String[] args) {
        Short s = 100;
        Bird b = new Bird();
        b.fly();
        b.fly(5);
        b.fly(s); //short to int type catsing if short method is not given
        b.fly(15,39);
    }
}