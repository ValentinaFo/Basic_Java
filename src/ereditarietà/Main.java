//Scrivere un programma che contenga una classe chiamata Animale ed un
// metodo chiamato faiIlVerso() che stampi il verso dell'animale.
//Crea poi una sottoclasse chiamata Gatto che fa override
// del metodo faiIlVerso() per miagolare. Prova quindi a far stampare il verso di
// Animale e di Gatto.

package ereditarietà;

public class Main {
    public static void main(String [] args) {
        Animale animale1 = new Animale("Un animale");
        System.out.println(animale1.nome);
        animale1.faIlVerso();
        Gatto cat = new Gatto("Il gattino");
        System.out.println(cat.nome + " fa ");
        cat.faIlVerso();

    }
}
