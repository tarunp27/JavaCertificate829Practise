package Enums;

enum Beer2{
    KF(70),KO(90),RC,FO;
    int price;

    Beer2(int price){
        this.price = price;
    }

    Beer2(){
        this.price=100;
    }

    public int getPrice(){
        return price;
    }
    public String toString() {return String.valueOf(price);}
}
public class EnumEx5 {
    public static void main(String[] args) {

                Beer2 [] b = Beer2.values();

        for (Beer2 b1 : b)
        {
            System.out.println(b1+"   "+b1.getPrice());
        }
        System.out.println(Beer2.KF.equals(Beer2.RC));
        //System.out.println(Beer2.KF.hashCode()>Beer2.RC.hashCode());
        //System.out.println(Beer2.KF>Beer2.RC);
        System.out.println(Beer2.KF==Beer2.RC);
        //Beer2.KF.ordinal()<Beer2.RC.ordinal();
        System.out.println(Beer2.KF.ordinal());
    }
}
