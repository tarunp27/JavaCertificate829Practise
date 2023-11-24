package Generics;

class Test<T>{
    T obj;
    Test(T obj){
        this.obj = obj;
    }
    public T getObject() {
        return this.obj;
    }
}
public class UserDefinedGen {
    public static void main(String[] args) {
        Test<Integer> iObj = new Test<Integer>(15);
        System.out.println(iObj.getObject());

        Test<String> sObj = new Test<String>("Tarun");
        System.out.println(sObj.getObject());
     }
}
