public class MatrixSpiral {
    public static void printSpiral(int[][] matrix) {
        int rowStart = 0;
        int colStart = 0;
        int rowEnd = matrix.length - 1;
        int colEnd = matrix[0].length - 1;

        while (rowStart <= rowEnd && colStart <= colEnd) {
            for (int i = colStart; i <= colEnd; i++) {
                System.out.print(matrix[rowStart][i] + " ");
            }

            for (int i = rowStart + 1; i <= rowEnd; i++) {
                System.out.print(matrix[i][colEnd] + " ");
            }

            if (rowStart < rowEnd && colStart < colEnd) {
                for (int i = colEnd - 1; i >= colStart; i--) {
                    System.out.print(matrix[rowEnd][i] + " ");
                }

                for (int i = rowEnd - 1; i > rowStart; i--) {
                    System.out.print(matrix[i][colStart] + " ");
                }
            }

            rowStart++;
            rowEnd--;
            colStart++;
            colEnd--;
        }
    }

    public static void printSpiralReverseClockwise(int[][] matrix) {
        int rowStart = 0;
        int colStart = 0;
        int rowEnd = matrix.length - 1;
        int colEnd = matrix[0].length - 1;

        while (rowStart <= rowEnd && colStart <= colEnd) {
            for (int i = colEnd; i >= colStart; i--) {
                System.out.print(matrix[rowEnd][i] + " ");
            }

            for (int i = rowEnd - 1; i >= rowStart; i--) {
                System.out.print(matrix[i][colStart] + " ");
            }

            if (rowStart < rowEnd && colStart < colEnd) {
                for (int i = colStart + 1; i <= colEnd; i++) {
                    System.out.print(matrix[rowStart][i] + " ");
                }

                for (int i = rowStart + 1; i < rowEnd; i++) {
                    System.out.print(matrix[i][colEnd] + " ");
                }
            }

            rowStart++;
            rowEnd--;
            colStart++;
            colEnd--;
        }
    }

    public static void printSpiralReverseCounterClockwise(int[][] matrix) {
        int rowStart = 0;
        int colStart = 0;
        int rowEnd = matrix.length - 1;
        int colEnd = matrix[0].length - 1;

        while (rowStart <= rowEnd && colStart <= colEnd) {
            for (int i = rowEnd; i >= rowStart; i--) {
                System.out.print(matrix[i][colEnd] + " ");
            }

            for (int i = colEnd - 1; i >= colStart; i--) {
                System.out.print(matrix[rowStart][i] + " ");
            }

            if (rowStart < rowEnd && colStart < colEnd) {
                for (int i = rowStart + 1; i < rowEnd; i++) {
                    System.out.print(matrix[i][colStart] + " ");
                }

                for (int i = colStart; i <= colEnd - 1; i++) {
                    System.out.print(matrix[rowEnd][i] + " ");
                }
            }

            rowStart++;
            rowEnd--;
            colStart++;
            colEnd--;
        }
    }

    private static void printMatrix(int[][] matrix) {
        printSpiral(matrix);
        System.out.println();
        printSpiralReverseClockwise(matrix);
        System.out.println();
        printSpiralReverseCounterClockwise(matrix);
        System.out.println();
        System.out.println();
    }

    public static void main(String[] args) {
        int[][] squareEvenMatrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        int[][] squareOddMatrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] longRectMatrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10, 11, 12}
        };
        int[][] wideRectMatrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };

        printMatrix(squareEvenMatrix);
        printMatrix(squareOddMatrix);
        printMatrix(longRectMatrix);
        printMatrix(wideRectMatrix);
    }
}
