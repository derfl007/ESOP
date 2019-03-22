package ab02;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

@SuppressWarnings("Duplicates")
public class Aufgabe27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++) {
            a[i] = i + 1;
        }
        System.out.println(Arrays.toString(a));
        int[] b = a.clone();
        for(int i = 0; i < n; i++) {
            a[i] = b[(n-1)-i];
        }
        System.out.println(Arrays.toString(a));
    }
}
