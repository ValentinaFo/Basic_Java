package giocatore;

import java.util.Arrays;

public class Combattimento {
    private Modalita modalita;
    private Giocatore[] giocatori =new Giocatore[4];

    public Combattimento(Modalita modalita) {
        this.modalita = modalita;
    }

    public Modalita getModalita() {
        return modalita;
    }

    public void setModalita(Modalita modalita) {
        this.modalita = modalita;
    }

    public Giocatore[] getGiocatori() {
        return giocatori;
    }

    public void setGiocatori(Giocatore[] giocatori) {
        this.giocatori = giocatori;
    }

    //● Realizzare un metodo per aggiungere un personaggio ai partecipanti del
//combattimento.
    public void aggGiocatore(Giocatore giocatore) {
        for (int i = 0; i < giocatori.length; i++) {
            if (giocatori[i] == null) {
                giocatori[i] = giocatore;
                break;
            }
        }
    }

    //metodo per rimuovere giocatore
    public void rimGiocatore(Giocatore giocatore) {
        Giocatore[] tempArray = new Giocatore[giocatori.length];
        for (int i = 0; i < giocatori.length; i++) {
            if (!(giocatore.getNome().equalsIgnoreCase(giocatori[i].getNome()))) {
                tempArray[i] = giocatori[i];
            }
            giocatori = tempArray;
        }
    }

    //METODO DI ATTACCO
    public static void attacco(Giocatore giocatore, Giocatore giocatoreDif) {
        giocatore.colpisci(giocatoreDif);
    }

    @Override
    public String toString() {
        return "Combattimento{" +
                "modalita=" + modalita +
                ", giocatori=" + Arrays.toString(giocatori) +
                '}';
    }
}