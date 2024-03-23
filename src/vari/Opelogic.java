package vari;/*Scrivi un programma che contiene un metodo che prenda un numero
 in ingresso e capisca
se un numero è pari o dispari utilizzando solo gli operatori logici.*/


public class Opelogic {
    public static void main(String[] args){
        int num = 75;
        pair(num);
    }
    public static void pair(int num){
        if((num%2) != 0){
            System.out.println("Number "  + num + " " + "is odd");
        }else{
            System.out.println("Number " + num  + " " + "is pair");
        }
    }
}
