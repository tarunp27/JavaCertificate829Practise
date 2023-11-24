package Classes;

interface Canine{
}
interface Dog{
}
public class Wolf implements Canine {
    public static void main(String[] args) {
         Wolf wolfy  = new Wolf();
         if(wolfy instanceof Dog d){
             Dog badWolf =(Dog)d;
         }
         else  {
             System.out.println("Not a object");
         }
    }
}
