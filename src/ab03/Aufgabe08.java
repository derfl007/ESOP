package ab03;

import java.util.Scanner;

import static ab03.Aufgabe06.teilt;

public class Aufgabe08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(isPrime(n));
    }
    static boolean isPrime(int p0) {
        if (teilt(p0, 2) && p0 != 2) return false;
        for(int i=3;i*i<=p0;i+=2) {
            if(teilt(p0, i)) return false;
        }
        return true;
    }
}
