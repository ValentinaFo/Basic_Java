package vari;//Scrivi un programma che contenga un metodo che prende in ingresso un valore numerico
// e restituisca la tabellina aritmetica di quel numero che dovrà essere stampata a video.

public class For1 {
    public static void main(String[] args){
     tabellina(3);
    }
    public static void tabellina( int numb){
        System.out.println("La tabellina del numero è: " + numb);
        for(int i = 1; i < 11; i++){
            int result = numb * i;
            String output = numb + "x" + i + " = " + result;
            System.out.println(output);

        }
    }
}
