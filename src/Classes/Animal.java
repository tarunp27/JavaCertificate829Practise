package Classes;

public class Animal {
    private int age;
    protected String name;

    public int getAge(){
        return age;
    }
    public Animal(){
        super();
        System.out.println("Animal constructor");
    }
    public void setAge(int newAge){
        age= newAge;
    }

    public static void main(String[] args) {
    }
}
