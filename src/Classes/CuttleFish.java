package Classes;


public class CuttleFish extends java.lang.Object {
    private String name = "Swimmy";
    {
        System.out.println(name);
    }
    private static int count = 0;
    static
    {
        System.out.println(count);
    }
    {
        count ++;
        System.out.println(count);
    }
    public CuttleFish(){
        System.out.println("Construct");
    }

    public static void main(String[] args) {
        System.out.println("Ready");
        new CuttleFish();
    }

    @Override
    public String toString() {
        return "something";
    }
}

