package ereditarietà;

public class Gatto extends Animale {
    public Gatto(String nome) {
        super(nome);
    }

    @Override
    void faIlVerso() {
        System.out.println("Miao, miao!");

    }
}
