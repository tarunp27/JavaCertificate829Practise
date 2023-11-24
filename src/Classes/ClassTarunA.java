package Classes;

public class ClassTarunA {
    private void play2(){
        System.out.println("Class a");
    }
}
class ClassTarunB extends ClassTarunA{
    public void play2(){
        System.out.println("Class B");
    }

    public static void main(String[] args) {
        ClassTarunB a = new ClassTarunB();
        a.play2();
    }
}
