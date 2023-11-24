package Classes;

import java.io.FileNotFoundException;
import java.io.IOException;

public class A {
    public A() throws RuntimeException {}
    void m1() throws IOException{}
}
class B extends A{
    //public B() throws FileNotFoundException{}    error the overriding class must have parent Exception to the inheriting class
    public  B() throws ArrayIndexOutOfBoundsException{}
    void m1() throws FileNotFoundException{}
}
