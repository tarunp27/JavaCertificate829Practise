package Methods;

public class StaticMethods {
    public int count1 = 10;// instance variable
    public static int count2 = 100;//static variable

    void printCounts() {    // non-static method (instance method).. this can access both static and instance variable.
        System.out.println(count1);
        System.out.println(count2);
    }


    public static void main(String[] args) {
        int i = 99;
       // System.out.println(count1);   // instance variable cannot be accessed by sttaic method
        StaticMethods sm1 = new StaticMethods();
        StaticMethods sm2 = new StaticMethods();

        sm1.count1= 100;
        sm2.count1=200;

        System.out.println(sm1.count1);
        System.out.println(sm2.count1);

        sm1.printCounts();
    }
}
