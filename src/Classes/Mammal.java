package Classes;

public class Mammal {
    String type = "mammal";
}
class Bat extends Mammal{
    String type = "Bat";
    public String getType(){
        return super.type+": "+type;
    }

    public static void main(String[] args) {
        System.out.println(new Bat().getType());
    }
}