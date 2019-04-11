package ab03;

import java.util.Scanner;

import static ab03.Aufgabe08.isPrime;

public class Aufgabe09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i = 0; i < n; i++) {
            if(isPrime(i)) System.out.println(i);
        }
    }
}
