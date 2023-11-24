package Classes;

import kotlin.reflect.jvm.internal.impl.renderer.ClassifierNamePolicy;

import java.util.Locale;

public class As {
    int x = 777;
    public void m1(){
        System.out.println("A");
    }
}
class Bs extends As{
    int x = 888;
    public void m1(){
        System.out.println("B");
    }
}
class Cs extends Bs{
    int x = 999;
    public void m1(){
        System.out.println("C");
    }
}
class Test{
    public static void main(String[] args) {
        Cs c = new Cs();
        c.m1();
        ((Bs)c).m1();
        ((As)(Bs)c).m1();

        System.out.println(c.x);
        System.out.println(((Bs)c).x);
        System.out.println(((As)(Bs)c).x);

        String s = new String("Tarun");
        Object o = (String)s;

        Bs b = new Bs();
        As cs = (As) b;

        Cs cc1 = new Cs();
        Bs bc1 = new Cs();
        As ac1 = new Cs();

        Bs bb1 = new Bs();
        As ab1 = new Bs();

        System.out.println(cc1 instanceof Cs);
        System.out.println(bc1 instanceof Cs);
        System.out.println(ac1 instanceof Cs);
        System.out.println(ac1 instanceof As);
        System.out.println(bb1 instanceof Bs);
        System.out.println(ab1 instanceof Cs);

        if (bc1 instanceof Cs y) {
            y.m1();
        }

//        CharSequence css = new String("baeldung");
        Object obj = new String("Pugalendi A");

//        String obj = new String("Pugal");

        if (obj instanceof String str) {
            System.out.println(str.toUpperCase());
        }

    }
}
