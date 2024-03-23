package hashMap1;

import studente.Studente;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;

//Creare 3 hashmap con 3 differenti metodi di inizializzazione e stampare il contenuto.
public class Main {
    public static void main(String[] args){
        Student marco = new Student("Marco","Via Veneto 12");
        Student giulia = new Student("Giulia","C/da Serra 5");
        Student alessandra = new Student("Alessandra","Via Umberto 9");
        Student giorgio = new Student("Giorgio","Via del Mare 45");

        //PRIMO METODO INIZIALIZZAZIONE CON COSTRUTTORE

        HashMap<String, Student> studentAddress = new HashMap<String, Student>();
        studentAddress.put("Marco", marco);
        studentAddress.put("Giulia", giulia);
        studentAddress.put("Alessandra", alessandra);
        studentAddress.put("Giorgio", giorgio);

        System.out.println("Studente e rispettivo indirizzo:" + studentAddress);

        //SECONDO METODO INIZIALIZZAZIONE

        Map<String,Student> studentAddress2 = Map.of("Marco", marco,"Giulia", giulia,"Alessandra", alessandra,"Giorgio", giorgio);
        System.out.println("Studente e rispettivo indirizzo:" + studentAddress2);

        //TERZO METODO INIZIALIZZAZIONE

        Map<String,Student> studentAddress3 = Map.ofEntries(
                new AbstractMap.SimpleEntry<>("Marco", marco),
                new AbstractMap.SimpleEntry<>("Giulia", giulia),
                new AbstractMap.SimpleEntry<>("Alessandra", alessandra),
                new AbstractMap.SimpleEntry<>("Giorgio", giorgio)

        );
        System.out.println("Studente e rispettivo indirizzo: " + studentAddress3);

    }
}
    

