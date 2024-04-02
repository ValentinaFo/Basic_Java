package myCheckpoint;

public class Compito {

    private String descrizione;
    private Stato stato;

    public Compito(String descrizione, Stato stato) {
        this.descrizione = descrizione;
        this.stato = stato;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public Stato getStato() {
        return stato;
    }

    public void setStato(Stato stato) {
        this.stato = stato;
    }


    @Override
    public String toString() {
        return "Compito{" +
                "descrizione='" + descrizione + '\'' +
                ", stato=" + stato +
                '}';
    }
}
