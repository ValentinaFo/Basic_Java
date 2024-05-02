package hashMap2;

public class Regione {
    public String nome;
    public String capoluogo;

    public Regione(String nome, String capoluogo) {
        this.nome = nome;
        this.capoluogo = capoluogo;
    }

    @Override
    public String toString() {
        return "Regione{" +
                "nome='" + nome + '\'' +
                ", capoluogo='" + capoluogo + '\'' +
                '}';
    }
}
