package DateTimeApi;

import java.time.Clock;
import java.time.Duration;
import java.time.Instant;
import java.time.ZoneId;

public class FindDuration {
    public static void main(String[] args) throws InterruptedException {
        var now = Instant.now();
        Thread.sleep(19);
        var then = Instant.now();

        var duration = Duration.between(now, then);
        System.out.println("Duration Milli-seconds : "+duration.toMillis());
        System.out.println("Duration nano-seconds  : " + duration.toNanos());

        ZoneId zoneid = ZoneId.of("Asia/Tokyo");
        Clock clock = Clock.system(zoneid);

        long ms = clock.millis();
        System.out.println(ms );

    }
}