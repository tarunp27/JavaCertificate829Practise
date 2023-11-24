package Interface;

//same return type same method signature

interface Herbivores{
    int AGE=9;
    public void eatPlants();
}
interface Ominivores{
    int type = 0;
    public void eatPlants();
    public void eatMeat();
}
class Birds {
    int age1 = 6;
    static int age2 = 7;
}
public class Bear extends Birds implements Herbivores, Ominivores {
//    int age1 = 6;
//    static int age2 = 7;

//    int type = 4;
    Bear() {
//        type = 1;
        age1 = 8;
        age2 = 18;
    }
    @Override
    public void eatMeat(){
        System.out.println("Eatin Meat");
    }
    public void eatPlants() {
            System.out.println("Eat plants");
    }
    public static void main(String[] args) {
        System.out.println(type);
        Bear b1 = new Bear();
        b1.eatMeat();
        b1.eatPlants();
    }
}

