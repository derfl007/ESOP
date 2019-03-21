package ab01;

import java.util.Scanner;

public class Aufgabe27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        if(x >= 50 && x <= 100) {
            System.out.println("KORREKT");
        } else {
            System.out.println("FALSCH");
        }
    }
}
