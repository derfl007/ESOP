package ab02;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Aufgabe29 {
    public static void main(String[] args) {
        int[] a = { 1, 3, 5 };
        int[] b = { 2, 4, 6, 8 };
        int[] c = new int[a.length+b.length];
        for(int i = 0; i < a.length+b.length; i++) {
            c[i] = (i < a.length) ? a[i] : b[i-a.length];
        }
        Arrays.sort(c);
        System.out.println(Arrays.toString(a));
    }
}
