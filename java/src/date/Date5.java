package date;
//Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
//Crea un secondo oggetto data da questa stringa 2024-03-01T13:00:00Z
//Verificare che la prima data è precedente alla seconda
//Verificare che la seconda data è successiva alla prima
//Verificare che le due date sono uguali ad ora
//Stampa il risultato

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

public class Date5 {
    public static void main(String[] args){
        OffsetDateTime firstDate = OffsetDateTime.parse("2023-03-01T13:00:00Z",DateTimeFormatter.ISO_OFFSET_DATE_TIME);
        OffsetDateTime secondDate = OffsetDateTime.parse("2024-03-01T13:00:00Z",DateTimeFormatter.ISO_OFFSET_DATE_TIME);
       boolean firstBefore = firstDate.isBefore(secondDate);
       boolean secondAfter = secondDate.isAfter(firstDate);
       boolean equalDate = firstDate.isEqual(secondDate);

        System.out.println("La prima data è prrecedente alla seconda: " + firstBefore);
        System.out.println("La seconda data è successiva alla prima" + secondAfter);
        System.out.println("Le due date sono uguali: " + equalDate);

    }
}
