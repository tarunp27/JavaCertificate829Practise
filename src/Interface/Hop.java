package Interface;

//non abstract methods

public interface Hop {
   // default int getJumpHeight(){ another non abstract method
    static int getJumpHeight(){
        return 8;
    }
}
class Bunny implements Hop{
    public void printDetails(){
       // System.out.println(getJumpHeight()); //does not compile because its a static method it must be referenced using a interface name
        System.out.println(Hop.getJumpHeight());
    }
}
class Main{
    public static void main(String[] args) {
        Bunny b = new Bunny();
        b.printDetails();
    }
}
