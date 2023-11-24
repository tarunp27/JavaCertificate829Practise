package DateTimeApi;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class DateExample2 {

    public static void main(String[] args) {
        var stdate = LocalDate.of(2022, Month.JANUARY, 31);
        var eddate = LocalDate.of(2022, Month.MAY, 30);
        var period = Period.ofMonths(1);  // create a period of one month
        performAnimalEnrichment(stdate, eddate, period);
        System.out.println("Calling DateExample before");
        DateExample.main(new String[0]);
        System.out.println("Calling DateExample after");
    }

    public static void performAnimalEnrichment(LocalDate stdt, LocalDate eddt, Period period) {
        var upTo = stdt;
        while (upTo.isBefore(eddt)) {
            System.out.println(" new toy: " + upTo);
//            upTo = upTo.plusMonths(1);
            upTo =  upTo.plus(period);
        }
    }

    String hike7 (int a){
        if(1<2) return "orange";
        return " ";
    }
}
