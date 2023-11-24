package DateTimeApi;

import java.time.Period;

public class PeriodEx3 {
    public static void main(String[] args) {
        System.out.println(Period.of(1,2,3));
        System.out.println(Period.ofMonths(3));
        System.out.println(Period.ofWeeks(1));
    }
}
