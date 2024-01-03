package idk;

import java.util.concurrent.RecursiveTask;
import java.util.concurrent.ForkJoinPool;

public class ParallelMatrixMultiplication {

    static class MatrixMultiplyTask extends RecursiveTask<int[][]> {
        int[][] matrixA, matrixB;
        int rowStart, rowEnd, colStart, colEnd;

        public MatrixMultiplyTask(int[][] matrixA, int[][] matrixB, int rowStart, int rowEnd, int colStart, int colEnd) {
            this.matrixA = matrixA;
            this.matrixB = matrixB;
            this.rowStart = rowStart;
            this.rowEnd = rowEnd;
            this.colStart = colStart;
            this.colEnd = colEnd;
        }

        @Override
        protected int[][] compute() {
            int numRows = rowEnd - rowStart + 1;
            int numCols = colEnd - colStart + 1;
            int[][] result = new int[numRows][numCols];

            if (numRows == 1 && numCols == 1) {
                result[0][0] = matrixA[rowStart][colStart] * matrixB[colStart][rowStart];
            } else {
                int midRow = (rowStart + rowEnd) / 2;
                System.out.println("midRow"+midRow);
                int midCol = (colStart + colEnd) / 2;
                System.out.println("midCol" + midCol);

                MatrixMultiplyTask topLeft = new MatrixMultiplyTask(matrixA, matrixB, rowStart, midRow, colStart, midCol);
                MatrixMultiplyTask topRight = new MatrixMultiplyTask(matrixA, matrixB, rowStart, midRow, midCol + 1, colEnd);
                //MatrixMultiplyTask topRight = new MatrixMultiplyTask(matrixA, matrixB, rowStart, midRow, midCol, colEnd-1);
                MatrixMultiplyTask bottomLeft = new MatrixMultiplyTask(matrixA, matrixB, midRow + 1, rowEnd, colStart, midCol);
                //MatrixMultiplyTask bottomLeft = new MatrixMultiplyTask(matrixA, matrixB, midRow, rowEnd-1, colStart, midCol);
                MatrixMultiplyTask bottomRight = new MatrixMultiplyTask(matrixA, matrixB, midRow + 1, rowEnd, midCol + 1, colEnd);
                //MatrixMultiplyTask bottomRight = new MatrixMultiplyTask(matrixA, matrixB, midRow, rowEnd-1, midCol, colEnd-1);

                topLeft.fork();
                topRight.fork();
                bottomLeft.fork();
                bottomRight.fork();

                int[][] topLeftResult = topLeft.join();
                int[][] topRightResult = topRight.join();
                int[][] bottomLeftResult = bottomLeft.join();
                int[][] bottomRightResult = bottomRight.join();

                // Combinar los resultados
                for (int i = 0; i < numRows; i++) {
                    for (int j = 0; j < numCols; j++) {
                        result[i][j] = topLeftResult[i][j] + topRightResult[i][j] + bottomLeftResult[i][j] + bottomRightResult[i][j];
                    }
                }
            }
            return result;
        }
    }

    public static int[][] parallelMatrixMultiply(int[][] matrixA, int[][] matrixB) {
        int numRows = matrixA.length;
        int numCols = matrixB[0].length;
        ForkJoinPool pool = new ForkJoinPool(4);

        return pool.invoke(new MatrixMultiplyTask(matrixA, matrixB, 0, numRows - 1, 0, numCols - 1));
    }

    public static void main(String[] args) {
        int[][] matrixA = {
            {1, 2, 3, 4},
            {3, 4, 5, 6},
            {7, 8, 9 , 10}
        };

        int[][] matrixB = {
            {5, 6},
            {7, 8},
            {9, 2},
            {10, 3}
        };

        int[][] result = parallelMatrixMultiply(matrixA, matrixB);

        for (int[] row : result) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
