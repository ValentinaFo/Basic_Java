package vari;//Scrivi un programma che contenga un metodo
// che prende in ingresso un carattere e ne identifica il tipo
// per un operazione di algebra (+ addizione - sottrazione * moltiplicazione / divisione).
//Nel caso non riesca ad identificare il tipo di operazione
// dovrà restituire una stringa di errore.

public class switchex {
    public static void main(String[] args){
        char i = '*';
        operazioni(i);
    }

    private static void operazioni(char i){
        switch (i) {
            case ('+') :
                System.out.println(i + "Addizione");
                break;
            case ('-') :
                System.out.println(i + "Sottrazione");
                break;
            case ('*') :
                System.out.println(i + "Moltiplicazione");
                break;
            case ('/') :
                System.out.println(i + "Divisione");
                break;
            default:
                System.out.println("Error");
                        break;
        }
    }
}
