//### Esercizio 3:
//**Traccia:**
//Scrivi un programma per gestire una lista di compiti da fare.
// Ogni compito dovrebbe avere una descrizione e uno stato (in corso, completato, o in sospeso).
// Implementa un sistema per aggiungere nuovi compiti, visualizzare tutti i compiti e filtrare
// i compiti per stato. Utilizza un array per memorizzare le informazioni sui compiti.
//**Suggerimenti:**
//1. Definisci una classe `Compito` che rappresenti un compito con attributi
// come descrizione e stato.
//2. Implementa una classe `ListaCompiti` che gestisca i compiti utilizzando un array per
// memorizzare le informazioni (La lista può contenere al massimo 1000 compiti).
//3. Alla lista dei compiti è possibile aggiungere un Compito
//4. La lista dei compiti deve essere in grado di mostrare tutti i compiti presenti.
//### Bonus
//5. Aggiungi la funzionalità di filtraggio dei compiti per stato
// (in corso, completato, o in sospeso).

package myCheckpoint;

public class Main {
    public static void main(String[]args){

        Compito spazzare = new Compito("lavare pavimenti",Stato.INCORSO);
        Compito lucidare = new Compito("lucidare superfici",Stato.COMPLETATO);
        Compito riordinare = new Compito("riordinare oggetti",Stato.COMPLETATO);
        Compito terminareCon = new Compito("Terminare le consegne",Stato.INSOSPESO);

        ListaCompiti myList = new ListaCompiti();
        myList.aggCompito(spazzare);
        myList.aggCompito(riordinare);
        myList.aggCompito(terminareCon);
        myList.aggCompito(lucidare);

        myList.visualizzaCompiti();
        System.out.println();


//        System.out.println("I compiti selezionati per stato sono:");
//        myList.searchState(Stato.COMPLETATO);
        myList.rimuoviCompito(lucidare);
        myList.visualizzaCompiti();
        System.out.println();












    }

}
