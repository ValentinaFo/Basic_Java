//Scrivere un programma che contenga una classe chiamata Forma
// ed un metodo chiamato calcolaArea() che stampi l'area della forma.
//Crea poi una sottoclasse chiamata Rettangolo che fa override del metodo calcolaArea()
// per calcolare l'area del rettangolo.

package ereditarietà1;

public class Main {

    public static void main(String[] args) {
    Forma forma = new Forma(8,5,3);
        System.out.println("Il risultato dell'area è: " + forma.calcolaArea());
        Rettangolo rectangle = new Rettangolo(4,2);
        System.out.println("Il risultato dell'area del rettangolo è: " + rectangle.calcolaArea());
        Triangolo triangle = new Triangolo(3,3,4);
        System.out.println("Il risultato dell'area del triangolo è: " +triangle.calcolaArea());
        Cerchio circle = new Cerchio(1);
        System.out.println("L'area del cerchio è: " + circle.calcolaArea());


    }
}
