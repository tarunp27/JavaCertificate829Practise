package Classes.Interface;

public class Fish implements isColdBlooded{
    public boolean hasScales(){
        System.out.println("hasScales");
        return true;
    }

    @Override
    public double getTemparature() {
        return isColdBlooded.super.getTemparature();
    }

    public static void main(String[] args) {

    }
}
