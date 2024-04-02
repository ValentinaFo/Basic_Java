package testModule;

import org.junit.jupiter.api.Test;

import java.time.DateTimeException;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    @Test
     public void getParse() {
        String date = "2023-03-01T13:00:00Z";
        OffsetDateTime expectedDate = OffsetDateTime.parse(date);
        OffsetDateTime actualDate = Main.getParse(date);
        assertEquals(expectedDate, actualDate);


    }
   @Test
    public void getFormatted(){
       OffsetDateTime testDate = OffsetDateTime.parse("2023-03-01T13:00:00Z");
       String expectedDate = testDate.format(DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ITALY));;
       String date = Main.getFormatted(testDate);
       assertEquals(expectedDate, date);
   }
//    @Test
//    public void GetParseInvalid() {
//        String invalidDate = "Invalid";
//        assertThrows(DateTimeException.class, () -> Main.getParse(invalidDate));
//    }
}