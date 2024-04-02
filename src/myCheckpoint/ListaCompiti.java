package myCheckpoint;

import java.util.Arrays;

public class ListaCompiti {
    private Compito[] compiti = new Compito[1000];
    private int numCompiti = 0;


    public ListaCompiti() {

    }

    public Compito[] getCompiti() {
        return compiti;
    }

    public void setCompiti(Compito[] compiti) {
        this.compiti = compiti;
    }

    public int getNumCompiti() {
        return numCompiti;
    }

    public void setNumCompiti(int numCompiti) {
        this.numCompiti = numCompiti;
    }

    public void aggCompito(Compito newCompito) {
        if (numCompiti < compiti.length) {
            for (int i = 0; i < this.compiti.length; i++) {
                if (this.compiti[i] == null) {
                    this.compiti[i] = newCompito;
                    numCompiti++;
                    break;
                }
            }
        }else {
            System.out.println("La lista dei compiti è piena, non pioi più aggiungere!");
        }
    }

    public void rimuoviCompito(Compito compito){
        for(int i = 0;i < this.compiti.length; i++){
            if(this.compiti[i] == compito){
                this.compiti[i] = null;
                numCompiti--;
            }
        }
    }

    public void visualizzaCompiti(){
        for(int i = 0; i < compiti.length; i++) {
            if (compiti[i] != null) {
                System.out.println(compiti[i]);
            }
        }
    }

    public void searchState(Stato st) {
        for(int i = 0; i < compiti.length; i++) {
            if (compiti[i] != null) {
                if (compiti[i].getStato().equals(st)) {
                    System.out.println(compiti[i]);
                }
            }
        }
    }

}