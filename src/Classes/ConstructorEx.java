package Classes;

class Camel{
    int age ;
    public Camel(){
        this(23);
        System.out.println("No arg constructor");
        //this(23); should be first statment in cosntructo body
    }
    public Camel(int age){
        //this();   recursive construcor invocation
        this.age=age;
        System.out.println("Parametrized constructor");
    }
}

public class ConstructorEx {
    public static void main(String[] args) {
        Camel c = new Camel();
        System.out.println(c.age);
    }
}
