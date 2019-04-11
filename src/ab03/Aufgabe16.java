package ab03;

public class Aufgabe16 {
    public static void main(String[] args) {
        int[][] test = {{1, 2, 3}, {4, 5, 6}};
        Aufgabe13.printMatrix(transpose(test));
    }

    private static int[][] transpose(int[][] matrix) {
        int[][] matrixTransposed = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrixTransposed[j][i] = matrix[i][j];
            }
        }
        return matrixTransposed;
    }
}
