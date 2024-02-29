public class Array1 {
    public static void main(String args[]) {
        int [] array = {1,2,3,4,5,5,4,3,2,1};
        removeDup(array);
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
    public static void removeDup (int[] array){
        for (int i = 0; i < array.length; i++){
            for(int j = 0; j < array.length; j++){
                if(array[i]==array[j] && j != i){
                    array[i]=-1;
                }
            }
        }
    }
}
