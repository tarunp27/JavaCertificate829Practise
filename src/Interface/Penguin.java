package Interface;

//different covariant return type and same method signature

interface Dances{
    String SwingArms();
}
interface EatsFish{
    CharSequence SwingArms();
}
public class Penguin implements Dances,EatsFish{
    public String SwingArms(){

        return "Swing";
    }

    public static void main(String[] args) {
        Penguin p1 = new Penguin();
        p1.SwingArms();
    }
}
