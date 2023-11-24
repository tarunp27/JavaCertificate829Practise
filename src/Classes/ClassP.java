package Classes;
//object casting with paret reference
public class ClassP {
    public void m1(){
    }
}
class ClassC extends ClassP{
    public void m2(){
    }
}
class Testing{
    public static void main(String[] args) {
        ClassC c = new ClassC();
        c.m1();
        c.m2();
        ((ClassP)c).m1();             //child object method m1() available in parent reference
        //((ClassP)c).m2();           //Type reference  child object method m2() not available for parent reference

        ClassP p = new ClassC();
        p.m1();
        int i = 'c'|'d';
        System.out.println(i);
    }
}
