package testModule;

import org.junit.jupiter.api.Test;

import java.time.DayOfWeek;
import java.time.Month;
import java.time.OffsetDateTime;

import static org.junit.jupiter.api.Assertions.*;

public class MainTTest {
    @Test
    void getYear() {
        OffsetDateTime date = OffsetDateTime.parse("2024-04-18T13:00:00Z");
        int result = MainT.getYear(date);
        assertEquals(2024, result);
    }

    @Test
    void getMonth() {
        OffsetDateTime date = OffsetDateTime.parse("2024-04-18T13:00:00Z");
        Month res = MainT.getMonth(date);
        assertEquals(Month.APRIL, res);

    }

    @Test
    void getDay() {
        OffsetDateTime date = OffsetDateTime.parse("2024-04-18T13:00:00Z");
        int dayOfMonth = MainT.getDay(date);
        assertEquals(18, dayOfMonth);
    }

    @Test
    void getDayOfWeek() {
        OffsetDateTime date = OffsetDateTime.parse("2024-04-18T13:00:00Z");
        DayOfWeek dayOfWeek = MainT.getDayOfWeek(date);
        assertEquals(DayOfWeek.THURSDAY, dayOfWeek);
    }


}