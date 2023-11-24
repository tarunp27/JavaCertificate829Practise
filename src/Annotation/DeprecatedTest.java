package Annotation;

public class DeprecatedTest {
    @Deprecated
    public void display(){
        System.out.println("DeprecatedTest diplay()");
    }

    public static void main(String[] args) {
        DeprecatedTest d1 = new DeprecatedTest();
        d1.display();
    }
}
