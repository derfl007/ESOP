package ab03;

import java.util.Arrays;

public class Aufgabe15 {
    public static void main(String[] args) {
        int[][] x = {{0, 1}, {2, 3}};
        System.out.println(Arrays.toString(convert2DTo1D(x)));
    }

    private static int[] convert2DTo1D(int[][] array) {
        int fullLength = 0;
        for (int[] row : array) {
            fullLength += row.length;
        }
        int[] array1D = new int[fullLength];
        for(int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array1D[i * j] = array[i][j];
            }
        }
        return array1D;
    }
}
