package Classes;

import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

public class Automobile {
}
class Car extends Automobile{
}
class TestDrive{
    public static void main(String[] args) {
        Automobile a = new Automobile();
        Car c = new Car();
        // c = (Car) a ;
        a = (Automobile) c;
        //System.out.println(a.equals(c));
//        var numA = new Integer[]{1, null, 3};
//        var listA = List.of(numA);

        var rlock = new ReentrantLock();
        try{
            rlock.lock();
        }
        finally {
            rlock.unlock();
        }
    }
}
