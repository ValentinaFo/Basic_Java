package nullability;

public class Main  {
    public static void main(String[] args) {
        Double num = 4.6;
        Double den = null;
        numDen(num, den);

    }
    public static void numDen (Double num, Double den) {

        try{
            if (num == null || den == null) {
                throw new IllegalArgumentException("Numeratore e denominatore non possono essere null");

            }
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}


