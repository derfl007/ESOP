package ab03;

import java.util.Arrays;
import java.util.Scanner;

public class Aufgabe18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int an = scanner.nextInt();
        int bn = scanner.nextInt();
        int[] a = Aufgabe12.readNumbers(an);
        int[] b = Aufgabe12.readNumbers(bn);
        System.out.println(Arrays.toString(mult(a, b)));
        System.out.println(Arrays.toString(sub(a, b)));

    }

    private static int[] mult(int[] a, int[] b) {
        if (a.length != b.length) {
            System.out.println("Arrays don't have the same size");
            return null;
        }
        for (int i = 0; i < a.length; i++) {
            a[i] = a[i] * b[i];
        }
        return a;
    }

    private static int[] sub(int[] a, int[] b) {
        if (a.length != b.length) {
            System.out.println("Arrays don't have the same size");
            return null;
        }
        for (int i = 0; i < a.length; i++) {
            a[i] = a[i] - b[i];
        }
        return a;
    }
}
