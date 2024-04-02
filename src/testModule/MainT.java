package testModule;


//Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
//        Ottieni l'anno
//        Ottieni il mese
//        Ottieni il giorno
//        Ottieni il giorno della settimana
//        Stampa i risultati sulla console -Crea dei test per questo esercizio
import java.time.DayOfWeek;
import java.time.Month;
import java.time.OffsetDateTime;

public class MainT {
    public static void main(String[] args) {
        OffsetDateTime date = OffsetDateTime.parse("2023-03-01T13:00:00Z");

        System.out.println(getYear(date));
        System.out.println(getMonth(date));
        System.out.println(getDay(date));
        System.out.println(getDayOfWeek(date));
    }

    public static int getYear(OffsetDateTime date) {
        return date.getYear();
    }

    public static Month getMonth(OffsetDateTime date){
        return date.getMonth();
    }

    public static int getDay(OffsetDateTime date){
        return date.getDayOfMonth();
    }

    public static DayOfWeek getDayOfWeek(OffsetDateTime date){
        return date.getDayOfWeek();
    }

}
//    public static void main(String[] args){
//
//        OffsetDateTime dateTime = OffsetDateTime.parse("2023-03-01T13:00:00Z");
//        String dateFormatted = getFormat(dateTime);
//        System.out.println(dateFormatted);
//        int year = getYear(dateTime);
//        String dayOf = String.valueOf(dateTime.getDayOfWeek());
//        int dayNum = getDayOfMonth(dateTime);
//        String month = dateTime.getMonth();
//
//        System.out.println("L'anno è :" + year + "\nIl giorno della settimana è : "
//                + dayOf + "\nIl mese è : " + dateTime.get.Month + "\nIl giorno del mese è : " + dayNum);
//

