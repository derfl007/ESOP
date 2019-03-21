package ab01;

import java.util.Scanner;

public class Aufgabe26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int z = scanner.nextInt();
        if(z % 17 == 0 || z < 0) System.out.println("KORREKT");
        else System.out.println("FALSCH");
    }
}
