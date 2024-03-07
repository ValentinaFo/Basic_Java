package EnumEsercizio;

public class Rettang extends Forma{
    private int base;
    private int altezza;

    public Rettang(int base, int altezza) {
        this.base = base;
        this.altezza = altezza;
    }
    @Override
    public double calcolaArea(){
        return base * altezza;
    }

}
//creo la sottoclasse rettangolo che estende Forma e ne eredita il metodo,
//per calcolare l'area creo due attributi privati della sottoclasse che vengono richiamati
// grazie al costruttore.
