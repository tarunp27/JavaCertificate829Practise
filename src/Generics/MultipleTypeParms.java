package Generics;

class Tests<T,U> {
    T obj1;
    U obj2;

    Tests(T obj1, U obj2){
        this.obj1=obj1;
        this.obj2=obj2;
    }
public void print(){
    System.out.println(obj1);
    System.out.println(obj2);
    }
}
public class MultipleTypeParms {
    public static void main(String[] args) {
//       Test<String,Integer> objs =
//               new Test<String,Integer>("Tarun",67);
//       objs.print();
    }
}
