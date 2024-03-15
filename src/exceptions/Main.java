//Scrivere una funzione che controlli se un numero int è in un determinato range.
// Se lo, è ritorna true ; se non lo è, lancia un'eccezione.

package exceptions;

    public class Main {


        static void checkNum(int num) {
            if (num > 18) {
                throw new ArithmeticException("Il numero selezionato ha superato il range");
            } else {
                System.out.println("True! Il numero rientra nel range!");
            }
        }

        public static void main(String[] args) {
            checkNum(34);
        }
    };

