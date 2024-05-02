package testModule;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

//Crea un oggetto OffsetDateTime da questa stringa 2023-03-01T13:00:00Z
//Formatta la data ottenendo 01 marzo 2023
//Stampa sulla console
//Fai attenzione a usare almeno Java 8
//Crea dei test per questo esercizio
public class Main {
    public static void main(String [] args){
        OffsetDateTime dateTime = getParse("2023-03-01T13:00:00Z");
        String date = getFormatted(dateTime);
        System.out.println(date);

     

    }

    static String getFormatted(OffsetDateTime dateTime) {
        return dateTime.format(DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ITALY));
    }

    static OffsetDateTime getParse(String date) {
        return OffsetDateTime.parse("2023-03-01T13:00:00Z");
    }
}
