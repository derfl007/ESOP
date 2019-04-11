package ab03;

import java.util.Arrays;

public class Aufgabe06 {
    public static void main(String[] args) {
        int[] array1 = { 1, 2, 3, 4, 5 };
        int a = 3;
        System.out.println(Arrays.toString(teilArray(array1, a)));

        int n = 100;
        int m = 10;
        System.out.println(teilt(n, m));
    }

    private static int[] teilArray(int[] arr, int a) {
        int[] arr2 = new int[a];
        System.arraycopy(arr, 0, arr2, 0, a);
        return arr2;
    }

    static boolean teilt(int n, int m) {
        return n % m == 0;
    }
}
