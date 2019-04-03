package ab03;

import java.util.Arrays;
import java.util.Scanner;

public class Aufgabe12 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(readNumbers(3)));
    }

    private static int[] readNumbers(int n) {
        Scanner scanner = new Scanner(System.in);
        int[] r = new int[n];
        for (int i = 0; i < n; i++) {
            r[i] = scanner.nextInt();
        }
        return r;
    }
}
