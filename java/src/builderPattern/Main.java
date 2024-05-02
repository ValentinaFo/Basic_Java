package builderPattern;
//Crea una classe Person con i campi firstName, lastName, age e address, i getter and i setter
//Il costruttore accetterà un Builder in input
//Creare una classe Builder che attraverso il costruttore e dei metodi specifici
// (tranne nome e cognome, gli altri campi sono opzionali) per costruire l'oggetto Person.
//Creare due oggetti Person e stamparli a video
public class Main {
    public static void main(String[] args) {
        Person fPerson = PersonBuilder.builder()
                .setFirstName("Anna")
                .setLastName("Fellini")
                .setAddress("via Napoleone 23")
                .setAge(18).build();

        System.out.println(fPerson);

        Person sPerson = PersonBuilder.builder()
                .setFirstName("Carlo")
                .setLastName("Di Giorgio").build();
        System.out.println(sPerson);
    }

}
