import org.junit.Assert;
import org.junit.Test;

public class SetZerosTests {
    @Test
    public void testSquare() {
        int[][] squareEvenMatrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 0, 12},
                {13, 0, 15, 16}
        };

        int[][] expectedMatrix = {
                {1, 0, 0, 4},
                {5, 0, 0, 8},
                {0, 0, 0, 0},
                {0, 0, 0, 0},
        };

        int[][] returnedMatrix = SetZeros.setZeros(squareEvenMatrix);
        Assert.assertArrayEquals(expectedMatrix, returnedMatrix);
    }

    @Test
    public void testLongRectangle() {
        int[][] longRectMatrix = {
                {1, 2, 3},
                {4, 0, 6},
                {7, 8, 9},
                {0, 11, 12}
        };

        int[][] expectedMatrix = {
                {0, 0, 3},
                {0, 0, 0},
                {0, 0, 9},
                {0, 0, 0},
        };

        int[][] returnedMatrix = SetZeros.setZeros(longRectMatrix);
        Assert.assertArrayEquals(expectedMatrix, returnedMatrix);
    }

    @Test
    public void testWideRectangle() {
        int[][] wideRectMatrix = {
                {1, 2, 3, 4},
                {5, 0, 7, 8},
                {0, 10, 11, 12},
        };

        int[][] expectedMatrix = {
                {0, 0, 3, 4},
                {0, 0, 0, 0},
                {0, 0, 0, 0},
        };

        int[][] returnedMatrix = SetZeros.setZeros(wideRectMatrix);
        Assert.assertArrayEquals(expectedMatrix, returnedMatrix);
    }

    @Test
    public void testSquareSideEffects() {
        int[][] squareEvenMatrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 0, 12},
                {13, 0, 15, 16}
        };

        int[][] expectedMatrix = {
                {1, 0, 0, 4},
                {5, 0, 0, 8},
                {0, 0, 0, 0},
                {0, 0, 0, 0},
        };

        SetZeros.setZerosWithSideEffects(squareEvenMatrix);
        Assert.assertArrayEquals(expectedMatrix, squareEvenMatrix);
    }

    @Test
    public void testLongRectangleSideEffects() {
        int[][] longRectMatrix = {
                {1, 2, 3},
                {4, 0, 6},
                {7, 8, 9},
                {0, 11, 12}
        };

        int[][] expectedMatrix = {
                {0, 0, 3},
                {0, 0, 0},
                {0, 0, 9},
                {0, 0, 0},
        };

        SetZeros.setZerosWithSideEffects(longRectMatrix);
        Assert.assertArrayEquals(expectedMatrix, longRectMatrix);
    }

    @Test
    public void testWideRectangleSideEffects() {
        int[][] wideRectMatrix = {
                {1, 2, 3, 4},
                {5, 0, 7, 8},
                {0, 10, 11, 12},
        };

        int[][] expectedMatrix = {
                {0, 0, 3, 4},
                {0, 0, 0, 0},
                {0, 0, 0, 0},
        };

        SetZeros.setZerosWithSideEffects(wideRectMatrix);
        Assert.assertArrayEquals(expectedMatrix, wideRectMatrix);
    }

}
