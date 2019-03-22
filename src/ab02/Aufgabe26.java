package ab02;

import java.util.Arrays;
import java.util.Scanner;

public class Aufgabe26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++) {
            a[i] = i + 1;
        }
        int i = 0;
        while(i < n) {
            System.out.println(a[i]);
            i++;
        }
    }
}
