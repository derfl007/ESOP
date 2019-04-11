package ab03;

import java.util.Arrays;

public class Aufgabe05 {
    public static void main(String[] args) {
        int[] a = {1, 2, 0};
        System.out.println(Arrays.toString(a));
        add2(a);
        System.out.println(Arrays.toString(a));
    }
    private static void add2(int[] p0) {
        System.out.println(Arrays.toString(p0));
        p0[2] = p0[0]+p0[1];
        System.out.println(Arrays.toString(p0));
    }
}
