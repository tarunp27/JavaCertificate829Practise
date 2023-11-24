package DateTimeApi;

import java.time.Duration;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class DurationEx1 {
    public static void main(String[] args) {
        var daily = Duration.ofDays(1);
        System.out.println(daily);
        System.out.println(Duration.of(1, ChronoUnit.DAYS));
        System.out.println(Duration.of(1,ChronoUnit.SECONDS));
        System.out.println(Duration.of(10,ChronoUnit.SECONDS));

        LocalTime time = LocalTime.of(3,12,45);
        System.out.println(time);
        LocalTime truncated = time.truncatedTo(ChronoUnit.HOURS);
        System.out.println(truncated);
    }
}
