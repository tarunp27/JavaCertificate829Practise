package Classes.Interface;

interface Herbivorous{
    public Integer eatPlants();
}
interface Omnivore{
    public Number eatPlants();
    //public void eatPlants();
}
interface Carnivore{
    public Integer eatPlants(int age);
}
public class Bear implements Herbivorous,Omnivore{
    public static void main(String[] args) {
        System.out.println(new Bear().eatPlants());
    }
    @Override
    public Integer eatPlants() {
        System.out.println("Herbi");
        return 10;
    }
//    public Number eatPlants(){
//        System.out.println("Omni");
//        return 10;
//    }

}
