package module4;

import java.math.BigDecimal;
import java.math.RoundingMode;

//Scrivi un programma Java dove imposti 2 BigDecimal e 1 operazione aritmetica (Addizione, sottrazione, moltiplicazione e divisione, min e max) definita in un enum
//Crei un metodo per calcolare l'operazione richiesta e e ritorni il risultato.
//Il tipo di operazione, i due dati in input e il risultato dovranno essere stampati a schermo
public class Main {
    public enum OperazioneAritmetica{
        ADDIZIONE,
        SOTTRAZIONE,
        MOLTIPLICAZIONE,
        DIVISIONE,
        MIN,
        MAX

    }
    public static BigDecimal operazioniAritm(BigDecimal  num1,BigDecimal num2,OperazioneAritmetica operazione) throws Exception{
        BigDecimal result = BigDecimal.ZERO;

        switch (operazione){
            case ADDIZIONE -> {
                result = num1.add(num2);
                break;
            }
            case SOTTRAZIONE -> {
                result = num1.subtract(num2);
                break;
            }
            case MOLTIPLICAZIONE -> {
                result = num1.multiply(num2);
                break;
            }
            case DIVISIONE -> {
                if(num2.compareTo(BigDecimal.ZERO)!= 0){
                    result = num1.divide(num2,2, RoundingMode.HALF_UP);
                }else{
                    throw new Exception("Errore di divisione per zero!");
                }
                break;
            }
            case MAX -> {
                result = num1.max(num2);
                break;
            }
            case MIN -> {
                result = num1.min(num2);
                break;
            }

        }
        return result;
    }
    public static void main(String[] args) throws Exception {
        BigDecimal firstNum = new BigDecimal("3.9");
        BigDecimal secondNuM = new BigDecimal("4.8");
        OperazioneAritmetica operazione = OperazioneAritmetica.MOLTIPLICAZIONE;

        BigDecimal risultato = operazioniAritm(firstNum,secondNuM,OperazioneAritmetica.MOLTIPLICAZIONE);
        System.out.println("Il primo numero è: " + firstNum);
        System.out.println("Il secondo numero è: " + secondNuM);
        System.out.println("L'operazione esegiuita è: " + operazione);
        System.out.println("Il risultato è: " + risultato);



    }


}
