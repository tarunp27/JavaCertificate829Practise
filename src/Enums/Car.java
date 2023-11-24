package Enums;

public enum Car {
    I20,I10,SANTRO,INDICA;
     Car(){
        System.out.println("Constructor");
    }
}
class TestDrive{
    public static void main(String[] args) {
        Car c1 = Car.I10;
        Car c2 = Car.I20;
        System.out.println("hello");
    }
}
