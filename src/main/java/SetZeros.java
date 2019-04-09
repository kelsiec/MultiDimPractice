import java.util.Arrays;

public class SetZeros {
    public static void setZeros(int[][] matrix) {
        boolean[] rowZeros = new boolean[matrix.length];
        boolean[] colZeros = new boolean[matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                rowZeros[i] = rowZeros[i] || matrix[i][j] == 0;
                colZeros[j] = colZeros[j] || matrix[i][j] == 0;
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = rowZeros[i] || colZeros[j] ? 0 : matrix[i][j];

                if (rowZeros[i] || colZeros[j]) {
                    matrix[i][j] = 0;
                } else {
                    matrix[i][j] = matrix[i][j];
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] squareEvenMatrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 0, 12},
                {13, 0, 15, 16}
        };
        int[][] longRectMatrix = {
                {1, 2, 3},
                {4, 0, 6},
                {7, 8, 9},
                {0, 11, 12}
        };

        setZeros(squareEvenMatrix);
        System.out.println(Arrays.deepToString(squareEvenMatrix));

        setZeros(longRectMatrix);
        System.out.println(Arrays.deepToString(longRectMatrix));
    }

}
