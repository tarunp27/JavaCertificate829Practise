package Classes;

interface I {
    void m4();
}
interface Z{
    void m4();
}
public class C implements I {
    public void m4(){}
    void m1(){
        System.out.println("C ClASS");
    }
}
class D extends C{
    void m2(){
        System.out.println("D CLASS");
    }
}
class Main{
    public static void main(String[] args) {
        C c = new C();
        D d = new D();

        c=(D)d;

        C c1 = new D();
        D d1 = (D)c1;

        c.m1();
        d.m1();
        //c.m2();
        d.m2();
    }
}
