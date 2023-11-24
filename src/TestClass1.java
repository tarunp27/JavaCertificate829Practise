import java.time.Instant;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class TestClass1 {
    final int age = 27;
    final int lage = 89;

    public static void main(String[] args) {
        int i = 1234567890;
        System.out.println(i) ;
        double d =i;
        System.out.println(d);
        System.out.println(i - (int)d);
        Instant ins = Instant.now();
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ins);
        System.out.println(ldt);
    }

    public int sum(int i1, int i2) {

        switch(age){
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
        }

        String result = switch (age) {
            case 1 -> "One";
            case 2 -> "Two";
            case 3 -> "Three";
            case 4 -> {
                System.out.println("Fourth option");
                yield "Four";
            }
//            case 5 -> 5;
            default -> "Others";
        };

        return i1 + i2;
    }
}


class cEmployee extends TestClass1 {
    int age = 55;
    //int lage =199;
    String name = "Tarun";
    int superAge = super.age;

    void printSuperAge() {
            System.out.println(superAge);
//        return superAge;
    }

    public int sum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        cEmployee emp = new cEmployee();
        System.out.println(emp.age);
        System.out.println(emp.lage);
        System.out.println(((TestClass1) emp).age);
        emp.printSuperAge();

        Set<String> st = new HashSet<>();

        final ReadWriteLock rwl = new ReentrantReadWriteLock();
    }
}



