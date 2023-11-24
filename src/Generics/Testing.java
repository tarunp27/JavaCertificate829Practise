package Generics;
//working of user defined generic

public class Testing <S> {
    S s;
    void anotherInstantDisplay(S element){
        this.s = element;
        System.out.println(s);
    }
    static <T> void genericDisplay(T element)
    {
        System.out.println(element.getClass().getName() + " = " + element);
    }

    public static void main(String[] args) {
        genericDisplay(292);
        genericDisplay("tarun");
        genericDisplay(2.3);
        new Testing<String>().anotherInstantDisplay("Pugalendi");
        new Testing<Double>().anotherInstantDisplay(99.99);
    }
}