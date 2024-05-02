/*/Scrivere una funzione che accetti in input 2 int e ne stampi la somma
Scrivere una funzione che accetti in input 1 char lo stampi
Scrivere una funzione che accetti in input 2 Integer e ne stampi la somma
Scrivere una funzione che accetti in input 1 Character lo stampi
Scrivere un un valore primitivo per int, double e char e fare autoboxing
Scrivere un oggetto per Integer, Double e Character e fare Unboxing
Usare le funzioni scritte con i valori creati

 */

package autoboxing;

public class Main {
    public static void main(String[] args) {

        int x = 3;
        int y = 5;
        double num3 = 3.56;
        char car = 'e';
        Integer num = 4;
        Integer num1 =3;
        Character carattere = 'Q';
        Integer combo = x; //Do a questa Integer il valore di un primit cioè(3)
        Character newChar = car; // quest'oggetto avrà come valore'e'
        Double dobleNum = num3; // quest'oggetto avrà come valore 3.56


        System.out.println(somma(x,y));

        stampaCh(car);
        integerSum(num,num1);
        printChar(carattere);


    }

    public static void printChar(Character carattere){
        System.out.println("Il carattere è : " + carattere);
    }
    public static void integerSum(Integer num,Integer num1){
        System.out.println("La somma di Integer è: " + (num + num1));
    }

    public static void stampaCh(char car) {
        System.out.println("Il carattere è: " + car);
    }

    public static int somma(int x, int y) {
        return x + y;

    }

}
