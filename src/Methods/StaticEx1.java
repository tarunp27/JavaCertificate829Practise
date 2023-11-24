package Methods;

public class StaticEx1 {
    private String name = "Tarun";//instance variable
    private static int i;//static variable1
    public static void first(){

    };
    public static void second(){
       // public int j = 102;//local variable access modifier not allowed
        System.out.println(i);
      //  System.out.println(name);
        i = i+1;
    };
    public void third(){
        //int k ;
        //k+=1;//local variable must be initailzed before using
        System.out.println(name );
        System.out.println(i);

    }

    public static void main(String[] args) {
        first();
        second();//calling static allowed
        //third();//calling instance method not allowed
    }
    public void print(){
        third();//calling instance method
        second();//calling static method
        first();//calling static method
    }
}




