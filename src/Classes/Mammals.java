package Classes;

public class Mammals {
    public final int weight;
    {
        weight=99;
    }
    public Mammals(int age){}
}
class Elephant extends Mammals{
    public final int age;
    public Elephant(int age){
        super (age);
        this.age = 25;
    }
}
class AfricanElephant extends Elephant{
    public AfricanElephant(){
        super(20);
    }
}