//Scrivere un programma che contenga una classe astratta chiamata Forma
// ed un metodo astratto chiamato calcolaArea().
//Crea poi due sottoclassi Rettangolo e Triangolo che estendono Forma
// ed implementano il metodo per il calcolo dell'area in maniera specifica.

package abstractClass;



public class Main {
public static void main(String [] args){
    Rettangolo rettangolo = new Rettangolo();
    rettangolo.calcolaArea();
    Triangolo triangle = new Triangolo();
    triangle.calcolaArea();
 }
}
