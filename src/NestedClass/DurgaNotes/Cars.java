package NestedClass.DurgaNotes;

public class Cars {
    double Engine = 1.2;
    static int wheels = 4;

    public void Hyundai()
    {
        int k = 30;
        final int m =40;

        class i20
        {
            public void Service(){
                System.out.println("Every 5 Months");
                System.out.println(k);
                System.out.println(m);
            }
        }
        i20 i = new i20();
        i.Service();
    }
    public static void main(String[] args) {
        Cars c = new Cars();
        c.Hyundai();
    }
}
