package Methods;

public class StaticInitialize {
    public static int one = 1;
    public static int two = 2;
    //public static int final two;// error because need to be initialized
    public static final int three = 3;
    public int four;
    public int five;
    public StaticInitialize(){
        System.out.println(one+" "+ two+" "+three);
        System.out.println(four+" "+five);
    }
    static {//static block
//        one =1;
//        two=2;
        //four=4;instance varaible cannot be used in static block
        System.out.println("Static block");
        System.out.println("Static value one&two " + one +" "+two);
    }
    {//instance block
        four = 4;
        five=5;
        one=100;//
        System.out.println("Instance block");
    }

    public static void main(String[] args) {
        System.out.println(one+" "+ two+" "+three);
        StaticInitialize s = new StaticInitialize();
        System.out.println(s.four+" "+s.five);
    }
}


