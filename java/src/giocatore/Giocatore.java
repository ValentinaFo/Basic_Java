package giocatore;

import java.util.Arrays;

public class Giocatore {
    private String nome;
    private Razza razza;
    private int posizioneX;
    private int posizioneY;
    private float salute;
    private int puntiAttacco;
    private int puntiDifesa;

    private String[] inventario;


    public Giocatore(String nome, Razza razza, int posizioneX, int posizioneY, float salute, int puntiAttacco, int puntiDifesa, String[]inventario) {
        this.nome = nome;
        this.razza = razza;
        this.posizioneX = posizioneX;
        this.posizioneY = posizioneY;
        this.salute = salute;
        this.puntiAttacco = puntiAttacco;
        this.puntiDifesa = puntiDifesa;
        this.inventario = inventario;
    }
    public Giocatore(String nome,Razza razza, int posizioneX, int posizioneY) {
        this.nome = nome;
        this.razza = razza;
        this.posizioneY = posizioneY;
        this.posizioneX = posizioneX;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Razza getRazza() {
        return razza;
    }

    public void setRazza(Razza razza) {
        this.razza = razza;
    }

    public int getPosizioneX() {
        return posizioneX;
    }

    public void setPosizioneX(int posizioneX) {
        this.posizioneX = posizioneX;
    }

    public int getPosizioneY() {
        return posizioneY;
    }

    public void setPosizioneY(int posizioneY) {
        this.posizioneY = posizioneY;
    }

    public float getSalute() {
        return salute;
    }

    public void setSalute(float salute) {
        this.salute = salute;
    }

    public int getPuntiAttacco() {
        return puntiAttacco;
    }

    public void setPuntiAttacco(int puntiAttacco) {
        this.puntiAttacco = puntiAttacco;
    }

    public int getPuntiDifesa() {
        return puntiDifesa;
    }

    public void setPuntiDifesa(int puntiDifesa) {
        this.puntiDifesa = puntiDifesa;
    }

    public String[] getInventario() {
        return inventario;
    }

    public void setInventario(String[] inventario) {
        this.inventario = inventario;
    }


    public void muovi(int posizioneX, int posizioneY) {

            setPosizioneX(posizioneX);
            setPosizioneY(posizioneY);
            System.out.println(posizioneX);
            System.out.println(posizioneY);

    }
    public void colpisci(Giocatore giocatore){
        if(giocatore.getPuntiDifesa()>this.puntiAttacco){
            giocatore.setSalute(salute);
        }else if(giocatore.getPuntiDifesa()<this.puntiAttacco) {
            giocatore.setSalute(giocatore.salute - (this.puntiAttacco - giocatore.puntiDifesa));
        }
    }
    public void status (){
        System.out.println("Nome: " + this.nome);
        System.out.println("Posizione: (" + this.posizioneX + ", " + this.posizioneY + ") ");
        System.out.println("Salute: " + this.salute);
        System.out.println("Punti Attacco: " + this.puntiAttacco);
        System.out.println("Punti Difesa: " + this.puntiDifesa);
        System.out.println("Inventario: " + Arrays.toString(this.inventario));
    }
}


