import java.util.Arrays;

public class SetZeros {
    public static int[][] setZeros(int[][] matrix) {
        int[][] returnMatrix = new int[matrix.length][matrix[0].length];
        // Make a deep copy, returnMatrix = matrix won't work!
        for (int i = 0; i < matrix.length; i++) {
            returnMatrix[i] = matrix[i].clone();
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    for (int k = 0; k < matrix.length; k++) {
                        returnMatrix[k][j] = 0;
                    }
                    for (int k = 0; k < matrix[i].length; k++) {
                        returnMatrix[i][k] = 0;
                    }
                }
            }
        }

        return returnMatrix;
    }

    public static void setZerosWithSideEffects(int[][] matrix) {
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
        int[][] wideRectMatrix = {
                {1, 2, 3, 4},
                {5, 0, 7, 8},
                {0, 10, 11, 12},
        };

        System.out.println(Arrays.deepToString(setZeros(squareEvenMatrix)));
        System.out.println(Arrays.deepToString(setZeros(longRectMatrix)));
        System.out.println(Arrays.deepToString(setZeros(wideRectMatrix)));


        setZerosWithSideEffects(squareEvenMatrix);
        setZerosWithSideEffects(longRectMatrix);
        setZerosWithSideEffects(wideRectMatrix);
        System.out.println(Arrays.deepToString(squareEvenMatrix));
        System.out.println(Arrays.deepToString(longRectMatrix));
        System.out.println(Arrays.deepToString(wideRectMatrix));
    }

}
