package Overloading;

public class OVEREX2 {
    public void fly(int numMiles){
        System.out.println("Primitive Int");
    }
    public void fly(Integer numMiles){
        System.out.println("Wrapper class");
    }
    public static void main(String[] args) {
        Integer i = 20;
        int i2 = 30;
//        new OVEREX2().fly(i);
//        new OVEREX2().fly(i2);
//        new OVEREX2().fly(20);
//        new OVEREX2().fly((Integer)20);
//        new OVEREX2().fly(Integer.valueOf(20));
//        new OVEREX2().fly(Integer.parseInt("20"));

        OVEREX2 ExObj = new OVEREX2();
        ExObj.fly(i);
        ExObj.fly(i2);
        ExObj.fly(20);
        ExObj.fly((Integer)20);
        ExObj.fly(Integer.valueOf(20));
        ExObj.fly(Integer.parseInt("20"));
    }
}
