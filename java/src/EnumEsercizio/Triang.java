package EnumEsercizio;

public class Triang extends Forma{
    private int base;
    private int altezza;

    public Triang(int base, int altezza) {
        this.base = base;
        this.altezza = altezza;
    }
    @Override
    public double calcolaArea(){
        return 0.5 * base * altezza;
    }
}
// stessa logica della sottoclasse precedente, aggiungo solo al metodo un return di 0.5(onesta
//l'ho copiato da internet ma suppongo sia per il resto dato dalla divisione.