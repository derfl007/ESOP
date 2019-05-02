package ab03;

import java.util.Scanner;

public class Aufgabe24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        System.out.println(decToBin(x));
    }

    private static String decToBin(int x) {
        int i = (int) (Math.log(x) / Math.log(2)) + 1;
        int[] bin = new int[i];
        while(i > 0) {
            i--;
            bin[i] = (x%2);
            x /= 2;
        }
        StringBuilder xBin = new StringBuilder();
        for(int b : bin) {
            xBin.append(b);
        }
        return xBin.toString();
    }
}
