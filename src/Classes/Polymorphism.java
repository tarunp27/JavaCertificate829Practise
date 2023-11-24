package Classes;

public class Polymorphism {
    public static void main(String[] args) {
        ListX l1 = new ArraylistX();
        ArraylistX l2 = new ArraylistX();
        l1.m1();
        l1.m2();
        l2.Specialm1();
        l2.m1();
        l2.m2();
    }
}
interface ListX{
    void m1();
    void m2();
}
class ArraylistX implements ListX {
    public void m1() {
        System.out.println("m1");
    }
    public void m2(){
        System.out.println("m2");
    }
    public void Specialm1(){
        System.out.println("Special m1");
    }
}
