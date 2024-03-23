package giocatore;

public class Main{
    public static void main(String[] args){
        String [] inventarioB ={"Piccone", "scudo", "pozione vita"};
        Giocatore Giovanni = new Giocatore("Gi",Razza.STREGONE, 1, 2, 100f, 15,
                20,inventarioB);
        Giocatore Mario = new Giocatore("Ma",Razza.ORCO, 1, 2, 100f, 20,
                15, inventarioB);
        Giocatore Luigi = new Giocatore("Lu",Razza.NANO, 1, 2, 100f, 30,
                5,inventarioB);
        Giocatore Paolo = new Giocatore("Pa",Razza.ELFO, 1, 2, 100f, 10,
                20,inventarioB);
        Combattimento comattimento = new Combattimento(Modalita.DEATHMATCH);
        comattimento.aggGiocatore(Giovanni);
        comattimento.aggGiocatore(Mario);
        comattimento.aggGiocatore(Luigi);
        comattimento.aggGiocatore(Paolo);
        Giovanni.status();
        Combattimento.attacco(Luigi, Giovanni);
        Giovanni.status();
        Combattimento.attacco(Luigi, Giovanni);
        Giovanni.status();

    }
}
