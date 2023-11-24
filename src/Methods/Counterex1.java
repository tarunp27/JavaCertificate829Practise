package Methods;

public class Counterex1 {
    public static int scount;
    public int icount;
    public Counterex1(){
        scount++;
        icount++;
    }
    public static void main(String[] args) {
        Counterex1 c1= new Counterex1();
        Counterex1 c2 = new Counterex1();
        Counterex1 c3 = new Counterex1();
        System.out.println(scount+" "+ c1.icount+" "+ c2.icount+" "+ c3.icount);
    }
}
