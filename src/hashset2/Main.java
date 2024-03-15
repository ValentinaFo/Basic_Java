//Scrivere una funzione che restituisca un HashSet riempito
//Creare un oggetto dello stesso tipo inserito nell'HashSet e popolarlo
//Verificare che l' elemento sia parte del Set e stampare il risultato

package hashset2;

import java.sql.SQLOutput;
import java.util.HashSet;

public class Main {

    public static void main(String[] args){
        System.out.println("Types of pasta included are: ");
        for(String pasta : typeOfPasta())
            System.out.println(pasta);

        System.out.println(typeOfPasta().contains("Stelline"));

    }
    private static HashSet<String> typeOfPasta(){
        HashSet<String> typeOfPasta = new HashSet<>();

        typeOfPasta.add("Fusilli");
        typeOfPasta.add("Penne rigate");
        typeOfPasta.add("Farfalle");
        typeOfPasta.add("Stelline");
        return typeOfPasta;
    }

}
