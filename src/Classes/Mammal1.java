package Classes;

public abstract class Mammal1 {
    void showHorn(){};
    abstract void eatLeaf();
}
abstract class Rhino extends Mammal1{
    abstract void showHorn();
}
class BlackRhino extends Rhino{
    void eatLeaf(){}
    void showHorn(){}
}
