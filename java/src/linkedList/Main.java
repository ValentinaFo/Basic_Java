package linkedList;
//Creare una classe Fruit che accenti nel costruttore il parametro name (String)
//In questa classe avere i metodi pubblici per ottenere le informazioni.
//Creare un LinkedList con elementi e stamparlo in console.
//Aggiungere un elemento al primo posto della lista e uno all'ultimo
//Stampare la collezione aggiornata

import java.util.LinkedList;

public class Main {
    public static void main(String[] args){
        LinkedList<Fruit> fruitList = new LinkedList<>();

        fruitList.add(new Fruit("Mela"));
        fruitList.add(new Fruit("Banana"));
        fruitList.add(new Fruit("Arancia"));
        fruitList.add(new Fruit("Banana"));
        fruitList.add(new Fruit("Arancia"));

        System.out.println("LA LISTA INIZIALE PREVEDE:");
                for(Fruit fruit : fruitList){
                    System.out.println(fruit.getName());
                }
        fruitList.addFirst(new Fruit("Uva"));
        fruitList.addLast(new Fruit("Ciliegia"));

        System.out.println("LA LISTA AGGIORNATA PREVEDE:");
               for(Fruit fruit : fruitList){
                   System.out.println(fruit.getName());
               }
    }


}
