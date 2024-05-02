package arrayList2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//Creare una classe Student che accetti nel costruttore il parametro name (String e age Int)
//In questa classe avere i metodi pubblici per ottenere le informazioni.
//Creare un ArrayList con 12 elementi e stamparlo in console.
//Mettere in ordine la collezione e stampare il risultato
public class Main {
    public static void main(String[] args){
        Student marco = new Student("Marco", 12);
        Student luisa = new Student("Luisa", 12);
        Student gianni = new Student("Gianni", 16);
        Student giada = new Student("Giada", 15);
        Student soraya = new Student("Soraya", 18);
        Student giuseppe = new Student("Giuseppe", 13);
        Student gianpaolo = new Student("Gianpaolo", 14);
        Student greta = new Student("Greta", 18);
        Student santi = new Student("Santi", 16);
        Student eveline = new Student("Eveline", 17);
        Student matteo = new Student("Matteo", 15);
        Student luigi = new Student("Luigi", 14);

        List<Student> studentList = Arrays.asList(marco,luisa,gianni,giada,soraya,giuseppe,gianpaolo,greta,santi,eveline,matteo,luigi);
        //System.out.println("La lista include gli studenti: "  + studentList);
        //System.out.println("Alla seconda posizione della nostra lista abbiamo l'oggetto: " + studentList.get(1));
        //studentList.set(1, new Student ("Silvia",12));
       // for(Student studente : studentList){
           // System.out.println("Lo studente: " + studente);
        //}



        System.out.println("Gli elementi contenuti nella lista sono: " + studentList.size());

        studentList.sort(Comparator.comparing(Student::getName));
        System.out.println(studentList);


        studentList.sort(Comparator.comparing(Student::getAge));
        System.out.println(studentList);





    }
}
