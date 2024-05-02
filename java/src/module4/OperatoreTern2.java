package module4;
//Copia il seguente programma Java e sostutuisci il costrutto if-else con l'operatore ternario

public class OperatoreTern2 {
    public static void main(String[] args) {
        System.out.println(checkString("Questa è una stringa!"));
    }

//    private static String checkString(String value) {
//        String result;
//        if (value.length() >= 10) {
//            result = "Lunghezza maggiore o uguale di 10";
//        } else {
//            result = "Lunghezza minore di 10";
//        }
//        return result;
//    }
    private static String checkString(String value) {
        final String result = value.length() >= 10
                ? "Lunghezza maggiore o uguale di 10"
                : "Lunghezza minore di 10";
        return result;
    }
}

