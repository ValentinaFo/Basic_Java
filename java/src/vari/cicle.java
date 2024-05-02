package vari;//Scrivi un programma che contenga un metodo che prende in ingresso
// un valore numerico e stampa tutti i numeri fino al valore immesso,
// la stampa dovrà interrompersi se il valore è uguale a 5.

public class cicle {
    public static void main(String[] args){
        int set = 10;
        int limit = 5;
        print(set, limit);
    }
    public static void print(int set, int limit){
        for(int i = set; i > limit; i--){
            System.out.println(i);
        }

    }
}

