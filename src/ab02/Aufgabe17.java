package ab02;

import java.util.ArrayList;
import java.util.Scanner;

@SuppressWarnings("Duplicates")
public class Aufgabe17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x;
        int pos = 0;
        int neg = 0;
        do {
            x = scanner.nextInt();
            if(x > 0) {
                pos++;
            } else if(x < 0) {
                neg++;
            }
        } while (x != 0);
        System.out.println("Positive numbers: " + pos + ", negative numbers: " + neg);
    }
}
