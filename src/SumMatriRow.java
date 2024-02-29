
public class SumMatriRow {
    public static void main(String[] args) {
        int[][] matrix = initializeMatrix();
        System.out.println(sumFirstRow(matrix));
    }

    public static int[][] initializeMatrix() {
        int[][] matrix = new int[5][5];  // Esempio con una matrice 5x5
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = i*5 + j + 1;  // Inizializzazione di esempio
            }
        }
        return matrix;
    }

    public static int sumFirstRow(int[][] matrix) {
        int sum = 0;
        for (int j = 0; j < matrix[0].length; j++) {
            sum += matrix[0][j];
        }
        return sum;
    }
}