package date;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

//Crea un oggetto OffsetDateTime da questa stringa 2023-03-01T13:00:00Z
//Formatta la data ottenendo 01 marzo 2023
//Stampa sulla console
public class Date2 {
    public static void main(String[] args) {
        OffsetDateTime march = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        System.out.println(march);

        String dateMarch = march.format(DateTimeFormatter.ofPattern("dd, MMMM, yyyy"));
        System.out.println("La data ottenuta è: " + dateMarch);
    }
}
