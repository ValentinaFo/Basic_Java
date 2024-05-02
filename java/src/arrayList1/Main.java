//Creare una classe Student che accenti nel costruttore il parametro
// name (String) e age (Int)
//In questa classe avere i metodi pubblici per ottenere le informazioni.
//Creare un ArrayList con n elementi e stamparlo in console.
//Aggiungere 4 elementi alla collezione e stampare la collezione aggiornata in console



package arrayList1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        Student s1 = new Student("Marco", 21);
        Student s2 = new Student("Valentina",29);
        Student s3 = new Student("Luisa",18);
        Student s4 = new Student("Enea",16);
        Student s5 = new Student("Giorgio", 22);

        List<Student> listaStudenti = new ArrayList<>();
        listaStudenti.add(s1);
        listaStudenti.add(s2);
        listaStudenti.add(s3);
        listaStudenti.add(s4);
        System.out.println("La lista include:" + listaStudenti);






    }
}
