package vari;

//Scrivi un programma che contenga un metodo che prende in ingresso
// un valore numerico e restituisca il nome del giorno della settimana come stringa o una stringa di
// errore nel caso di valore maggiore di 7 o minore di 1.
public class switch2 {
    public static void main(String[] args) {
        int day = 3;
        int day2 = 8;
        dayWeek(day);
        dayWeek(day2);
        }

    public static void dayWeek(int day) {

        switch (day) {
            case (1):
                System.out.println("Lunedi");
                break;
            case (2):
                System.out.println("Martedi");
                break;
            case (3):
                System.out.println("Mercoledì");
                break;
            case (4):
                System.out.println("Giovedì");
                break;
            case (5):
                System.out.println("Venerdi");
                break;
            case (6):
                System.out.println("Sabato");
                break;
            case (7):
                System.out.println("Daomenica");
                break;
            default:
                System.out.println("ERRORE");
                break;
        }

    }
}





