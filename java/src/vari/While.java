package vari;

//Scrivere un programma che contenga un metodo che sfrutti il while loop
//e prenda in ingresso 1 valore intero come limite superiore e calcoli la somma di tutti
// i valori prima del limite e la stampi a video.
//(Esempio passo 5 come limite e otterrò la somma di 1 + 2 + 3 + 4)
public class While {
    public static void main(String[] args){
        System.out.println("La somma è uguale a: " + sommaNum(45));

    }
    private static int sommaNum(int sumNum){
        int i = 0;
        int sum = 0;
        while (i < sumNum){
            sum += i;
            i++;
        }
        return sum;
    }
}
