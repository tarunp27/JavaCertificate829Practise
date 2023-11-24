package NestedClass.DurgaNotes;

public class AmusmentPark {
    int price =500;

    class Wonderla{
        int price =900;
        static String name = "tarun";
        public void food(){
            int price = 200;
            System.out.println(price);
            System.out.println(this.price);
            System.out.println(AmusmentPark.this.price);
        }
    }

    public static void main(String[] args) {
        AmusmentPark p = new AmusmentPark();
        Wonderla w= p.new Wonderla();
        w.food();
    }
}
