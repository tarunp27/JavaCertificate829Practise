package DateTimeApi;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class InstantEx {
    public static void main(String[] args) {
        var now = Instant.now();
        //time consuming
        var later  = Instant.now();
        System.out.println(now);
        var duration = Duration.between(now,later);
        System.out.println(duration.toMillis());
    }
}
