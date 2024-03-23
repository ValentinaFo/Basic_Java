package checkpoint1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Concessionaria {
    private String nome;

    private Auto[] lista = new Auto[0];

    public Concessionaria(String nome, Auto[] lista) {
        this.nome = nome;
        this.lista = lista;
    }

    public Concessionaria(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Auto[] getLista() {
        return lista;
    }

    public void setLista(Auto[] lista) {
        this.lista = lista;
    }

    public void stampaAuto() {
        System.out.println("Auto in concessionaria " + this.getNome() + ":\n" + Arrays.toString(lista) + '\n');
    }

    public void addAuto(Auto auto) {
        Auto[] temp = new Auto[lista.length + 1];
        for(int i = 0; i < lista.length; i++) {
            temp[i] = lista[i];
        }
        temp[temp.length - 1] = auto;
        lista = temp;
        System.out.println("Auto aggiunto: " + auto.getMarca() + " " + auto.getModello());
    }

    public void eliminaAuto(Auto auto) {
        int ind = 0;
        Auto[] temp = new Auto[lista.length - 1];
        for (int i = 0; i < lista.length; i++) {
            if (!auto.equals(lista[i])) {
                temp[ind] = lista[i];
                ind++;
            }
        }
        lista = temp;
        System.out.println("Auto eliminato: " + auto.getMarca() + " " + auto.getModello());
    }

    public void cercaAuto(String s) {
        Auto[] result = new Auto[lista.length];
        int j = 0;
        for (int i = 0; i < lista.length; i++) {
            if (lista[i].getMarca().toLowerCase().contains(s.toLowerCase()) || lista[i].getModello().toLowerCase().contains(s.toLowerCase()))
            {
                result[j] = lista[i];
                j++;
            }
        }
        System.out.println("Auto trovati:\n" + Arrays.toString(result));
    }
    public HashMap<String, Integer> conteggioPerMarca(){

        HashMap<String, Integer> conteggio = new HashMap<>();

        for (Auto auto : lista ){
            String marca = auto.getMarca();
            conteggio.put(marca, conteggio.getOrDefault(marca, 0)+1);
        }
        return conteggio;
    }

}
