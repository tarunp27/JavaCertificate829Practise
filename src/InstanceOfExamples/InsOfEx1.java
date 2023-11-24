package InstanceOfExamples;

public class InsOfEx1 {
    public static void main(String[] args) {
        Number num = 6;
        if(num instanceof Integer data){
            System.out.println(data);
        }
        //valid statement below if Number is used
        if(num instanceof Number){
            int i = (Integer) num;
            System.out.println(i);
        }
        //invalid statement below if Number with pattern when used.  it should be sub type of num object.
        // if you make num as Object instead of NUmber at line 5, then same below code will work.
//        if(num instanceof Number data){
//            System.out.println(data);
//        }
    }
}
