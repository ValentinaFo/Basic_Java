//Create la struttura, La popolate e poi implementate una ricerca nel set a partire da un valore
// di input, se lo trovate allora lo togliete dal set. Fate in modo di trovare tutti i valori
// con cui avete popolato il set in modo che rimanga vuoto. A quel punto stampate il set per vedere
// che sia effettivamente vuoto.

package hashset3;

import java.util.HashSet;

public class Main{
    public static void main(String[] args){

        HashSet<Integer> numbers = new HashSet<Integer>();

                numbers.add(1);
                numbers.add(3);
                numbers.add(10);

        System.out.println(numbers);

                for(int i = 1; i <= 10; i++) {
                    if (numbers.contains(i)) {
                        numbers.remove(i);
                        System.out.println(i + " Il numero è stato rimosso ");
                    }
                }
                System.out.println(numbers);
            }

        }

