package Generics.New_Gnerics;
interface Shippable <T>{
    public void ship(T t);
}
public class ShippableRobo implements Shippable<String> {
    public void ship(String t){
        System.out.println("Shipabble");
    }
}
class ShippableAbstarct <T> implements Shippable<T>{
    public void ship(T u){
        System.out.println("Shipabble abstarct");
    }
}
class ShippableCrate implements Shippable{
    public void ship(Object t){
        System.out.println("sHIPPABLE CARTE");
    }
}