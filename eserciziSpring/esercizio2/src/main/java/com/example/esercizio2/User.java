package com.example.esercizio2;

public class User {
    public User(String nome, String provincia) {
        this.nome = nome;
        this.provincia = provincia;
        this.saluto = "Ciao " + nome + " com é il tempo in " +  provincia;
    }

    public String nome;
    public String provincia;
    public String saluto;
}
