package hashMap2;

import java.util.AbstractMap;
import java.util.Map;

//Creare un hashmap, prendere tutti i valori, ordinarli e stamparli
public class Main {
    public static void main(String[] args){
        Regione lazio = new Regione("LAZIO","Roma");
        Regione sicilia = new Regione("SICILIA","Palermo");
        Regione puglia = new Regione("PUGLIA","Bari");
        Regione lombardia = new Regione("LOMBARDIA","Milano");
        Regione piemonte = new Regione("PIEMONTE", "Torino");

        Map<String,Regione> regioneMap = Map.ofEntries(
                new AbstractMap.SimpleEntry<>("Lazio", lazio),
                new AbstractMap.SimpleEntry<>("Sicilia", sicilia),
                new AbstractMap.SimpleEntry<>("Piemonte", piemonte),
                new AbstractMap.SimpleEntry<>("Lombardia", lombardia),
                new AbstractMap.SimpleEntry<>("Puglia", puglia)
        );
        System.out.println("I capoluoghi di regione sono:" + regioneMap);

        //System.out.println(regioneMap.get("Puglia"));
        System.out.println(regioneMap.size());
    }
}
