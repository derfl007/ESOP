package ab02;

import java.util.Arrays;
import java.util.Scanner;

public class Aufgabe34 {
    public static void main(String[] args) {
        int[] arr1 = new int[30];
        for(int i = 0; i < arr1.length; i++) {
            arr1[i] = (int) (Math.random() * 20 + 1);
        }
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = 0;
        for(int a : arr1) {
            if(a == n) x++;
        }
        int[] arr2 = new int[arr1.length-x];
        int j = 0;
        for (int i1 : arr1) {
            if (i1 != n) {
                arr2[j] = i1;
                j++;
            }
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }
}
