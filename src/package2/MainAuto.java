package package2;

/*Scrivere un programma che contenga una classe che definisce un Auto
 che abbia  come proprietà cilindrata, targa, marca e modello.
Per questa classe saranno necessari i metodi accessori (getters e setters) ed un costruttore.
Nel main dichiarare un oggetto di tipo Auto.
In questo caso la nota importante è rendere le proprietà
della classe auto accessibili solo attraverso i metodi./

 */
public class MainAuto {
    public static void main(String[] args) {
        Auto car = new Auto("Mercedez","Smart","YT875JH", 234);
        Auto Car1 = new Auto("Toyota", "Yaris","TR234HG",125);
        System.out.println("La cilindrata dell'auto " + car.getMarca() +" modello " + car.getModello()+" è: " + car.getCilindrata());
        System.out.println("Il modello " + Car1.getModello() + " della casa automobilistica " + Car1.getMarca() + " è identificata con la targa numero " + car.getTarga());
        Auto Car2223 = new Auto("Range Rover","Luxury Suv", "FR500IY", 123);
        System.out.println("L'ultima targa assegnata a " + Car2223.getMarca() + " " + Car2223.getModello() + " è stata: " + Car2223.getTarga());
        Auto car3 = new Auto("Ford","A caso");
        System.out.println("car 3 è: " + car.getMarca() + car.getModello());




    }

}
// Vorrei capire come evitare di scrivere tutti i parametri //



