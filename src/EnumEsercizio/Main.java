//Scrivere un programma che contenga una classe chiamata Forma
// ed un metodo chiamato calcolaArea() che stampi l'area della forma specifica.
//Crea poi due sottoclassi Triangolo e Rettangolo che estendono Forma
// e che abbiano un tipo che ne identifichi la Forma in maniera univoca usando una enum.

package EnumEsercizio;

import java.sql.SQLOutput;

public class Main {
    public static void main(String [] args){
        Rettang rettangolo = new Rettang(3, 6);
        System.out.println("Area del rettangolo: " + rettangolo.calcolaArea());
        Triang triangolo = new Triang(3,6);
        System.out.println("L'area del triangolo è: " + triangolo.calcolaArea());


        System.out.println("La forma geometrica selezionata è: /t " + TypeOf.RECTANGLE);
        System.out.println("La forma geometrica selezionata è: /t " + TypeOf.TRIANGLE);
    }

}
//nella classe principale creo gli oggetti triangolo e rettangolo
//che richiamano i rispettivi metodi, aggiungengo valori a caso
//richiamo l'enum comune a entrambe le sottoclassi