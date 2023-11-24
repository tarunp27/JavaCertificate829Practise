package Enums;

public enum Color {
    BLUE,RED{
        public void info(){
            System.out.println("Danger color");
        }
    },GREEN;

    public void info()
    {
        System.out.println("Universal Color");
    }
    static final  String name = "Pugal";
}
class Test {
    public static void main(String[] args) {
        Test t = null;
        Color [] c = Color.values();
        for(Color c1:c)
        {
            c1.info();
            System.out.println(c1.name);
        }
        System.out.println(t.hashCode());
    }
}


