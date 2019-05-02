package ab03;

import java.util.Arrays;

public class Aufgabe29 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 1, 3, 5, 2, 1};
        System.out.println(Arrays.toString(convert(a)));
    }

    private static int[] convert(int[] a) {
        int size = 0;
        for (int i = 1; i < a.length-1; i+=2) {
            size += a[i];
        }
        int[] res = new int[size];
        for (int i = 1, j = 0; i < a.length-1; i+=2) {
            for(int k = 0; k < a[i]; k++, j++) {
                res[j] = a[i-1];
            }
        }
        return res;
    }
}
