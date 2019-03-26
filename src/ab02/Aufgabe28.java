package ab02;

import java.util.Arrays;

public class Aufgabe28 {
    public static void main(String[] args) {
        int[] a = { 3, 2, 1 };
        int[] b = { 6, 5, 4 };
        int[] c = new int[a.length+b.length];
        for(int i = a.length-1; i >= 0; i--) {
            c[(a.length - 1) - i] = a[i];
        }
        for(int i = b.length-1; i >= 0; i--) {
            c[((b.length - 1) - i) + a.length] = b[i];
        }
        System.out.println(Arrays.toString(c));
    }
}
