package DateTimeApi;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;

public class PeriodvsDurationEx {
    public static void main(String[] args) {
        var date = LocalDate.of(2022,5,25);
        var period = Period.ofDays(1);
        var duration = Duration.ofDays(1);

        System.out.println(date.plus(period));
        //System.out.println(date.plus(duration));//Unsupported unit
    }
}
