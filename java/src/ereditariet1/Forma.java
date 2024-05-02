package ereditariet1;

public class Forma {
    protected int numeriLato;
    protected int lunghezzaLato;
    protected int altezzaLato;

    public Forma(int numeriLato, int lunghezzaLato, int altezzaLato) {
        this.numeriLato = numeriLato;
        this.lunghezzaLato = lunghezzaLato;
        this.altezzaLato = altezzaLato;
    }

    public float calcolaArea(){
        return (lunghezzaLato * numeriLato * altezzaLato) / 2;
    }
}


