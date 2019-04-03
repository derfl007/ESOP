package ab03;

public class Aufgabe13 {
    public static void main(String[] args) {
        printMatrix(new int[][] {{0,0,0}, {0,0,0}});
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] matrix1 : matrix) {
            for (int i : matrix1) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
