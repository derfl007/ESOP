package ab02;

import java.util.Scanner;

public class Aufgabe16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println((isPrime(n) ? "" : "not a ") + "prime");
    }
    private static boolean isPrime(int n) {
        if(n % 2 == 0) return false;
        for(int i = 3; i*i<=n; i++) {
            if(n%i == 0) return false;
        }
        return true;
    }
}
