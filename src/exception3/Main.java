package exception3;
//Scrivere una funzione che provi a dividere un numero per 0
// e catturi l'eccezione leggendone il messaggio.
public class Main {
    public static void main(String[] args) {
        int dividendo = 10;
        int divi = 0;

        try {
            int risultato = dividendo / divi;
            System.out.println("Il risultato della divisione è: " + risultato);
        } catch (ArithmeticException e) {
            System.out.println("ERRORE. La divisione per zero non è permessa. Dettagli errore: " + e.getMessage());
        }
    }
}
