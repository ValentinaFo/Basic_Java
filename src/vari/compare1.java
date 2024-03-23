package vari;//Scrivi un programma che contiene un metodo  confronti due numeri interi e determini se sono diversi.
//Il programma dovrà stampare a video i due valori e il risultato dell'eguaglianza.


/*/public class vari.compare1 {
    public static void main (String[] args){
        int elemento = 3;
        int element = 5;
        System.out.println("First number is " + elemento + ", " + "second number is " + element);
        System.out.println(equal(elemento,element));
    }
    public static String equal (int elemento, int element){
        if (element == elemento){
            String result = "Numbers are equals";
            return result;
        }else{
            String res = "Numbers are different.";
            return res;

        }
    }
}*/
public class compare1 {
    public static void main(String[] args) {
        int rife = 1;
        int rif = 3;
        compare(rife,rif);
        int tech = 45;
        int tec = 45;
        compare(tech,tec);

    }
    public static void compare(int num1, int num2){
        System.out.println("rife = " + num1);
        System.out.println("rif = " + num2);
        boolean equals = num1 == num2;
        System.out.println("I numeri sono uguali? = " + equals);
    }

}
