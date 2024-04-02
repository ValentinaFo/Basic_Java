package testModule;

import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;

import static org.junit.jupiter.api.Assertions.*;
public class Main3Test {
    @Test

    public void getPlusYears(){
        OffsetDateTime expectedDate = OffsetDateTime.parse("2024-02-01T13:00:00Z");
        OffsetDateTime dateTime = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        dateTime = Main3.getPlusYears(dateTime);
        assertEquals(expectedDate,dateTime);

    }
    @Test
    public void getMinusMonth(){
        OffsetDateTime expectedMonth = OffsetDateTime.parse("2023-02-01T13:00:00Z");
        OffsetDateTime dateTime = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        dateTime = Main3.getMinusMonths(dateTime);
        assertEquals(expectedMonth ,dateTime);
    }





}