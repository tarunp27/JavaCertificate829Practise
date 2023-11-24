package Interface;
//to test multiple interface with same variable in multiple interface

import kotlin.reflect.jvm.internal.impl.renderer.ClassifierNamePolicy;

interface I1 {
    int AGE = 5;  // implicitly public static final.
}

interface I2 {
    int AGE = 55;  // implicitly public static final.
    void sayAge();
}

interface I3 extends I2,I1 {

}

class C1{ }

class C2 {}
public class MultipleInterface extends C1 {
    public void sayAge() {
        System.out.println(I1.AGE);
        System.out.println(I2.AGE);
    }

    public static void main(String[] args) {
        MultipleInterface mi = new MultipleInterface();
        mi.sayAge();
        System.out.println("Question35 -T4");
        char chk = 10;
        do {
            chk --;
            System.out.println((short)chk);
        }while(chk<10);
    }
}
