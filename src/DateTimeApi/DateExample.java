package DateTimeApi;

import java.time.LocalDate;
import java.time.Month;

//using plusMonths() method to a LodalDate object.

public class DateExample {
    public static void main(String[] args) {
        var stdate = LocalDate.of(2022, Month.FEBRUARY,1);
        var eddate = LocalDate.of(2022,Month.SEPTEMBER,30 );
        performAnimalEnrichment(stdate,eddate);
    }

    public static  void performAnimalEnrichment(LocalDate stdt, LocalDate eddt) {
        var upTo = stdt;
        while (upTo.isBefore(eddt)) {
            System.out.println(" new toy: "+upTo);
            upTo = upTo.plusMonths(1);
        }
    }
}
