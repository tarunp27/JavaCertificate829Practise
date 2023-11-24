package Classes.Immutable1;
class Money{
    int cash;
    Money(int i){
        this.cash=i;
    }
}
public class Employee {
    private final Money money;
    Employee(Money m){
        this.money=m;
    }
    public static void main(String[] args) {
        Money m = new Money(10000);
        Employee e = new Employee(m);
        System.out.println(e.money.cash);
    }
}
