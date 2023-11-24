package Methods;

public class PassByValue {
    public static void main(String[] args) {
        Integer num = 4;//callbyvalue
        newNumber(num);
        System.out.println(num);
    }
    public static void newNumber(Integer num){
        num=8;
    }
}
