package Classes;
//  Call by Value - java is always call by value
// but can be reference also

class Student {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}



public class CallByValue {
    public static void main(String[] args) {
        int sale = 100;
        new CallByValue().multiplyfiv(400);
        System.out.println(sale);

        StringBuilder sb1 = new StringBuilder("Pugal");    // this is reference variable so changing the value means affects the actual value
        changeName(sb1);
        System.out.println(sb1);

        String city = new String("Bangalore");
        changeCity(city);
        System.out.println(city);

        Integer wci = 10;
        changeInteger(wci);
        System.out.println(wci);

        Student s = new Student("Pugal", 55);
        System.out.println(s.getName()+" "+s.getAge());
        changeStudent(s);
        System.out.println(s.getName()+" "+s.getAge());

    }

    public static void changeStudent(Student s){
        s.setName("Pugalendi Arumugam");
        s.setAge(58);
    }

    void multiplyfiv(int sale){
        sale = sale*5;
    }
    public static void changeName(StringBuilder s) {
        s.append(" Arumugam");
    }

    public static void changeCity(String c){
        c = c.concat("City");
    }

    public static void  changeInteger(Integer i) {
        i = i + 20;
    }

}
