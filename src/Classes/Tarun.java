package Classes;

public  class Tarun {
    static int age1= 22;
    public void play1(){
        System.out.println("class Tarun");
    }
}
class Sarvesh extends Tarun {
    static int age2 = 11;

    public void play1() {
        System.out.println("class Sarvesh play1");
    }

    public void play2() {
        System.out.println("class Sarvesh play2");
    }

    public static void main(String[] args) {
        Tarun t1 = new Sarvesh();
        Tarun t2 = new Tarun();


        t1.play1();
        System.out.println(t1.age1);
        System.out.println(t2.age1);
        //System.out.println(t1.age2);

        int age0;
        //System.out.println(age0+15);
    }
}