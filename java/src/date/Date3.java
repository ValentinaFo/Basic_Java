package date;

import java.sql.SQLOutput;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

//Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
//ottieni l'anno
//ottieni il mese
//ottieni il giorno
//ottieni il giorno della settimana
//Stampa i risultati sulla console
public class Date3 {
    public static void main(String[] args) {
        OffsetDateTime date = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        System.out.println(date);
        int year = date.getYear();
        String month = String.valueOf(date.getMonth());
        int dayNumber = date.getDayOfMonth();
        String dayWeek = String.valueOf(date.getDayOfWeek());
        System.out.println("Year: " + year + "\nMonth: " + month + "\nDay of the week: " + dayWeek);


    }
}
