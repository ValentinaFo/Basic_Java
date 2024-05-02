package studente;
/* Scrivere un programma che contenga una classe che definisce uno Studente
 che abbia come proprietà nome, cognome ed identificativo.
Per questa classe saranno necessari i metodi accessori (getters e setters) ed un costruttore.
Nel main dichiarare un oggetto di tipo Studente. /

 */
public class MainSstudente {
    public static void main(String [] args){
        Studente studente1 = new Studente("Luca", "Foti", 678);
        System.out.println("Il primo studente della classe è: " + studente1.getNome() + " matricola numero: " + studente1.getId());
        Studente student345 = new Studente("Gianni ", "Sperti",987);
        System.out.println("La nuova matricola è " + student345.getId() + " : " + student345.getNome() + student345.getCognome());

    }

}
