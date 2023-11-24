package NestedClass.DurgaNotes;

public class Outer {
    int x = 10;
    static int y = 20;

    class Inner
    {
        int z=30;
        static int x1=40;
        public void m1()
        {
            System.out.println(x);
            System.out.println(y);
            System.out.println(z);
            System.out.println(x1);
        }
    }

    public static void main(String[] args) {
        Outer o = new Outer();
        Inner i =o.new Inner();
        i.m1();
    }
}
