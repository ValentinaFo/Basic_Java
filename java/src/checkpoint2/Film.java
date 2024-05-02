package checkpoint2;

public class Film {
    private String regista;
    private String titolo;
    private int annoDiUscita;

    private Genere genere;

    public Film() {
    }

    public Film(String regista, String titolo, int annoDiUscita, Genere genere) {
        this.regista = regista;
        this.titolo = titolo;
        this.annoDiUscita = annoDiUscita;
        this.genere = genere;
    }

    public String getRegista() {
        return regista;
    }

    public void setRegista(String regista) {
        this.regista = regista;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public int getAnnoDiUscita() {
        return annoDiUscita;
    }

    public void setAnnoDiUscita(int annoDiUscita) {
        this.annoDiUscita = annoDiUscita;
    }

    public Genere getGenere() {
        return genere;
    }

    public void setGenere(Genere genere) {
        this.genere = genere;
    }

    @Override
    public String toString() {
        return "Film{" +
                "regista='" + regista + '\'' +
                ", titolo='" + titolo + '\'' +
                ", annoDiUscita=" + annoDiUscita +
                ", genere=" + genere +
                '}';
    }
}
