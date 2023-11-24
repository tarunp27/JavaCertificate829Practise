package Classes;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public class Bike {
    //public void m1(){                            //public private default not allowed
//        System.out.println("m1");
//    }
    public int cc(){
        return 100;
    }
    public void m2() throws IOException {
        System.out.println("parent m2");
    }
    public void fly(List<Integer> list ){}
}
abstract class enfield extends Bike{
    public abstract int cc();
    public void fly(List<Integer> list ){}
}


class Yamaha extends Bike{
    private void m1(){
        System.out.println("child m1");
    }
    public void m2()throws IOException{
        System.out.println("child m2");
    }

}
