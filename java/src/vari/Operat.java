package vari;//Scrivi un programma che contiene un metodo che date due variabili le incrementi
// di un valore scelto da te e le moltiplichi fra di loro.
//Il metodo dovrà restituire il risultato dell'operazione che dovrà essere stampato a video.//

public class Operat {
    public static void main(String args[]){
        int a = 20;
        int b = 15;
        System.out.println(operat(a,b));
    }
    public static int operat (int a , int b){
        a += 2;
        b += 2;
        int molt = a * b;
        return molt;
    }
}
