package NestedClass;

import jdk.swing.interop.SwingInterOpUtils;


public class A {
    record EmpRec(String name){};
    private int x = 10;
    abstract class MIC {
        abstract void print();
    }
    class B{
        record EmpRec(String name){};
        private int x = 20;
        class C{
            private int x = 30;
            public void allThex(){
                System.out.println(x);
                System.out.println(this.x);
                System.out.println(B.this.x);
                System.out.println(A.this.x);
            }
        }
    }
//    public static void main(String[] args) {
//        A a = new A();
//        A.B b = a.new B();
//        A.B.C c = b.new C();
//        c.allThex();
//    }
}

class TestClass {
    public static void main(String[] args) {
        A a = new A();
        A.B b = a.new B();
        A.B.C c = b.new C();
        c.allThex();
    }
}