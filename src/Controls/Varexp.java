package Controls;

public class Varexp {
    int i = 99;             //insatnce variable
    static int si = 929;    //class variable
    public int j =99;       //instance variable
    //var vi2 = 99;         // var cannot be a instance variable
    public void printmethod(){
        int mj = 99;         //local variable
        var v1 = 100;
        //var v2=100, v3 = 100;   // var cannot do multiple assignments.
        System.out.println(mj);
    }
    public static void main(String[] args) {
       Varexp v1 = new Varexp();
       Varexp v2 = new Varexp();
       Varexp v3 = new Varexp();
       v1.i = 199;
       v2.i=292;
       v3.i=393;
       Varexp.si = 100;
       v1.si = 222;
       v2.si   = 333;
        System.out.println("v1 " + v1.i + " v2.1 " + v2.i + " v3.i " + v3.i+ " v1.si " + v1.si + " v2.si " + v2.si);
        v1.printmethod();
        v1.printmethod();
    }



}
