package NestedClass;

public class Park {
    int age = 89;
    static String name = "Tarun";
    public Park() {
        System.out.println("Park constructor");
    }

    static class Ride {
        private int price = 8;
        public Ride() {
            System.out.println("Constructor");
            //System.out.println(new Park().age+1);  //working
            //System.out.println(Park.this.age);    // not allowed you cant call from static content.
            System.out.println(name);
        }
        public void goSpeed(){
            price++;
        }
    }

    public static void main(String[] args) {
        var ride = new Park.Ride();
        System.out.println(ride.price);

        Park p = new Park();
        System.out.println(p.age);

        System.out.println();
    }
}
