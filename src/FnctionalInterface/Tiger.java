package FnctionalInterface;

interface Sprint{                        //Functional interface
    public void sprint(int speed);
    String toString();    //abstarct method of object class
    int hashCode();       //abstract method of object class

    //public void getSpeed(int weight);  // should have only one abstract method in funtional interface
}

public class Tiger {
    public static void main(String[] args) {
        Sprint s1= (x) ->{
            System.out.println("Speeding at :" + x);
        };
        s1.sprint(200);
    }
}
