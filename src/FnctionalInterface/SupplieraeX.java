package FnctionalInterface;

import java.time.LocalDate;
import java.util.function.Supplier;

public class SupplieraeX {
    public static void main(String[] args) {

        Supplier<LocalDate> s1 = LocalDate::now;   //method reference

        Supplier<LocalDate> s2 = ()->{
         return LocalDate.now();
        };

        System.out.println(s1.get());
        System.out.println(s2.get());
        System.out.println(LocalDate.now());
    }
}
