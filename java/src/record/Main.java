package record;
//Definisci un oggetto Record che rappresenti un Punto con le coordinate x & y

public class Main {
    public static void main(String[]args){
        Punto p1 = new Punto(10,15);

        System.out.println("Il valore di x è:" + p1.x());
        System.out.println("Il valore di y è: " + p1.y());
        System.out.println("Le coordinate di p1 sono:" + p1);
    }
}
