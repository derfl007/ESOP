package ab01;

import java.util.Scanner;

public class Aufgabe28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if(a >= 50 && a <= 100 && a%2==0) System.out.println("KORREKT");
        else System.out.println("FALSCH");
    }
}
