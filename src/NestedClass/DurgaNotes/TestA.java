package NestedClass.DurgaNotes;

public class TestA {
    static int x =10 ;
    static int y=20;
    public static void m1()
    {
        class TestB
        {
            public void sum(int x,int y)
            {
                System.out.println("the Sum:" +(x+y));
            }
            public void m2()
            {
                System.out.println(x);
                System.out.println(y);
            }
        }

        TestB t2 = new TestB();
        t2.m2();
        t2.sum(100,200);
        t2.sum(400,500);
        t2.sum(800,200);
    }
    public static void main(String[] args) {
        TestA t1 = new TestA();
        t1.m1();
    }
}

