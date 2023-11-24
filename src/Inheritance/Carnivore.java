package Inheritance;

//about hiding variables/overriding

class Meerkat {
    protected boolean hasFur = false;
}

public class Carnivore extends Meerkat {
    protected boolean hasFur = true;


    public static void main(String[] args) {
        Carnivore c1 = new Carnivore();
        Meerkat m1 = c1;
        System.out.println(c1.hasFur);
        System.out.println(m1.hasFur);
    }
}
