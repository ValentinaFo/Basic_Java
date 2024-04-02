package date;
//Crea un oggetto OffsetDateTime da questa stringa 2002-03-01T13:00:00Z
//Formatta la data ottenuta in FULL, MEDIUM e SHORT
//Stampa le varie versioni

import java.sql.SQLOutput;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.chrono.ChronoLocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;


public class Date1 {
    public static void main(String[] args){
        ZonedDateTime marzo = OffsetDateTime.parse("2002-03-01T13:00:00Z").atZoneSimilarLocal(ZoneId.of("Europe/Rome"));
        System.out.println("La data è: " + marzo);

        String dateFull = marzo.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL));
        System.out.println(dateFull);


        //String date = marzo.format(DateTimeFormatter.ofPattern("dd, MMMM, YYYY"));
        //System.out.println("Formato Full : " + date);


        String date1 = marzo.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM));
        System.out.println("Formato medium : " + date1);

        String date3 = marzo.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT));
        System.out.println("Formato short: " + date3);


    }
}


