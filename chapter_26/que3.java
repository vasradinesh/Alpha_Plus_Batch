import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

// set 0 that row and coloum

public class que3 {
     public static void main(String[] args) {
        int[][] matrix = {
            {1,1,1},
            {1,0,1},
            {1,1,1}
        };

        setZeroes(matrix);

        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        Set<Integer> zeroRows = new HashSet<>();
        Set<Integer> zeroCols = new HashSet<>();

        // Step 1: Find rows and columns with 0
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    zeroRows.add(i);
                    zeroCols.add(j);
                }
            }
        }

        // Step 2: Set zeros
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (zeroRows.contains(i) || zeroCols.contains(j)) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
