package vari;

public class EsArray1 {
    public static void main(String args[]) {
        int[] numbers = array();
        System.out.println(sum(numbers));
    }
    public static int[] array (){
        int[] pipp = new int[30];
        for (int i = 0 ; i < 30 ; i++){
            pipp[i] = i+1;
        }
        return pipp;
    }
    public static int sum (int[] numbers){
        int sum = 0;
        for (int number : numbers){
            sum += number;
        }
        return sum;
    }
}




