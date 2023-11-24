package Overloading;

import java.time.LocalDate;

public class Over_ex3 {
    public void fly(String s){
        System.out.println("String parameter");
    }
    public void fly(Object o){
        System.out.println("Object paramter");
    }
    public void fly(int i){
        System.out.println("integer parameter");
    }
}
class Main1{
    public static void main(String[] args) {
        Over_ex3 fly1 = new Over_ex3();
        fly1.fly("Eagle");
        fly1.fly(1000);
        fly1.fly(LocalDate.of(2022,12,23));
    }
}
