package exception4;
/*Scrivere una funzione che accetti un array in input
e provi a dividere un numero dell'array per 0 e gestisca sia l'eccezione della divisione
che quella di indice non presente nell'array, leggendone il messaggio.
Eseguire sempre un blocco di codice scrivendo un messaggio in console. */



public class Main {

    public static void main(String[] args) {

        int[] myArray = {15, 2, 12, 50,};


        try {
            int result = divisione(myArray, 4);
            System.out.println("Risultato della divisione è : " + result);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Errore di esecuzione; Indice non presente nell'array." + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Errore: Divisione per zero non eseguibile." + e.getMessage());
        }
        finally {
            System.out.println("Questo blocco viene sempre eseguito.");
        }
    }
    public static int divisione(int[] myArray, int index) {
        if (index < 0 || index >= myArray.length) {
            throw new ArrayIndexOutOfBoundsException("L'indice non è presente nell'array");
        }
        return myArray[index] / 0;
    }
}





