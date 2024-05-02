package testModule;
//Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
//aggiungi un anno
//sottrai un mese
//aggiungi 7 giorni
//Stampa il risultato localizzata per l'Italia
//Crea dei test per questo esercizio

import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Main3 {
public static void main(String[] args){
    OffsetDateTime dateTime = OffsetDateTime.parse("2023-03-01T13:00:00Z");
    dateTime = getPlusYears(dateTime);
    dateTime = getMinusMonths(dateTime);
    dateTime = dateTime.plusDays(7);
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy, HH:mm:ss").withLocale(Locale.ITALY).withZone(ZoneId.of("Europe/Rome"));
    String date = dateTime.format(formatter);
    System.out.println("La data italiana è: " + date);
   }

    static OffsetDateTime getMinusMonths(OffsetDateTime dateTime) {
        return dateTime.minusMonths(1);
    }

    static OffsetDateTime getPlusYears(OffsetDateTime dateTime) {
        return dateTime.plusYears(1);
    }
}
