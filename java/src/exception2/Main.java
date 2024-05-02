package exception2;
//Scrivere una funzione che controlli se un carattere è un numero, altrimenti lanciare una eccezione.


import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        char character = 'e';

        try {
            verificaCarattere(character);
            System.out.println("Il carattere è un numero.");
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void verificaCarattere(char c) throws FileNotFoundException {
        if (Character.isDigit(c)) {
            System.out.println("Il carattere è un numero.");
        } else {
            throw new FileNotFoundException("Il carattere non è un numero.");
        }
    }
}
