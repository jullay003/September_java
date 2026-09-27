package DAY4;

import java.time.*;

public class DateTime {
    public static void main(String[] args) {
        final LocalDate date = LocalDate.of(2026, 9, 26);
        final LocalTime time = LocalTime.of(14, 30);

        final LocalDateTime dateTime =
                LocalDateTime.of(date, time);

        final ZonedDateTime indiaTime =
                ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));

        System.out.println(date);
        System.out.println(time);
        System.out.println(dateTime);
        System.out.println(indiaTime);

    }
}
