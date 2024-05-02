//Scrivere un programma che contenga una interfaccia Forma
// ed un metodo chiamato calcolaArea().
//Crea poi due sottoclassi Rettangolo e Triangolo che implementano Forma
// ed implementano il metodo per il calcolo dell'area.

package interfaces;

public class Main {
    public static void main(String []args){
        Rectangle myRectangle = new Rectangle();
        myRectangle.calcolaArea();
        Triangle myTriangle = new Triangle();
        myTriangle.calcolaArea();
    }



}



