package vari;//Scrivi un programma che calcoli la lunghezza di una stringa,
// sulla base di questa lunghezza stampi "Lunghezza maggiore di 10",
// "Lunghezza minore di 10" o "Lunghezza pari a 10"

public class Statementif {
    public static void main(String[] args){
        String name = " Enea";
        lenght(name);
    }
    public static void lenght (String name){
        if(name.length() > 10) {
            System.out.println("La lunghezza di " + name.length() + " è maggiore di 10");

        }else if(name.length() <10) {
            System.out.println("La lunghezza di " + name.length() + " è minore di 10");
        }else
            System.out.println("La lunghezza di " + name.length() + " è pari a 10");
    }
}
