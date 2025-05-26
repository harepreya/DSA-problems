import java.util.Arrays;
public class SetMatrixZero {
    public static void main(String[] args) {
        int matrix[][] = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        setZeroes(matrix);
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
    static void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        int[] row = new int[n];
        int[] col = new int[m];

        // Find the rows and columns that need to be zeroed
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 0) {
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }

        // Set the elements to zero
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (row[i] == 1 || col[j] == 1) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
