package DateTimeApi;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class PeriodEx2 {
    public static void main(String[] args) {
        var start = LocalDate.of(2022, Month.JANUARY,1);
        var end = LocalDate.of(2022,Month.APRIL,30);
        var period = Period.ofMonths(1);
        var anually = Period.ofYears(1);
        var quaterly=Period.ofWeeks(3);
        var everyYearandWeek = Period.of(1,0,7);
        var wrong =Period.ofYears(1).ofWeeks(1);
        perform(start,end,period);
    }

    private static void perform(LocalDate start, LocalDate end, Period period) {
        var upTo = start;
        while(upTo.isBefore(end)){
            System.out.println("give new toy:" + upTo);
            upTo = upTo.plusMonths(1);
        }
    }
}
