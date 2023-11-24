import java.sql.SQLOutput;

public class ToStringex {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.printname();
        System.out.println(emp1.toString());
    }
}
class Employee{
    int age = 55;
    String name = "Pugal";
    public void printname()
    {
        System.out.println("Name of employee: " + name);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
