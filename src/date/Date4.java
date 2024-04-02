package date;
//Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
//aggiungi un anno
//sottrai un mese
//aggiungi 7 giorni
//Stampa il risultato localizzata per l'Italia

import java.sql.SQLOutput;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Date4 {
    public static void main(String[] args) {
        ZonedDateTime date = OffsetDateTime.parse("2023-03-01T13:00:00Z").atZoneSimilarLocal(ZoneId.of("Europe/Rome"));
        System.out.println(date);

        OffsetDateTime year = date.plusYears(1).toOffsetDateTime();
        System.out.println(year);
        String datePlusYear = year.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM));
        System.out.println(datePlusYear);

       OffsetDateTime dateMinus = date.minusMonths(1).toOffsetDateTime();
       String dateMinStr = dateMinus.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM));
       System.out.println(dateMinStr);

       OffsetDateTime addDays = date.plusDays(7).toOffsetDateTime();
       String dayPlus = addDays.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM));
       System.out.println(dayPlus);





    }
}
