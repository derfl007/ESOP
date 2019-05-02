package ab03;

import java.util.Arrays;

public class Aufgabe25 {
    public static void main(String[] args) {
        int[][] array = {{0, 0, 0, 0}, {1, 1, 1, 1}, {2, 2, 2, 2}, {3, 3, 3, 3}};
        System.out.println(Arrays.toString(reduceArray(array)));
    }

    private static int[][] reduceArray(int[][] array) {
        int[][] reducedArray = new int[array.length/2][array[0].length-1];
        for(int row = 0; row <= array.length; row+=2) {
            for(int col = 0; col <= array[row].length; col+=2) {
                reducedArray[row/2][col/2] = array[row][col];
            }
        }
        return reducedArray;
    }
}
