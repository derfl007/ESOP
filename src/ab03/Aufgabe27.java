package ab03;

import java.util.Arrays;

public class Aufgabe27 {
    public static void main(String[] args) {
        int[][] m1 = {
                {2, 3, 4},
                {5, 6, 7}
        };
        int[][] m2 = {
                {2, 3},
                {4, 5},
                {6, 7}
        };
        System.out.println(Arrays.deepToString(multMatrices(m1, m2)));
    }

    private static int[][] multMatrices(int[][] mat1, int[][] mat2) {
        if(mat1[0].length != mat2.length) return null;
        int size = (mat1.length < mat2.length) ? mat1.length : mat2.length;
        int[][] res = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                int val = 0;
                for (int k = 0; k < mat1[i].length; k++) {
                    val += mat1[i][k] * mat2[k][j];
                }
                res[i][j] = val;
            }
        }
        return res;
    }
}
