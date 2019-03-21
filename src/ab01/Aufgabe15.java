package ab01;

import java.util.Scanner;

public class Aufgabe15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int max = 0;
        if(x != y) System.out.println("Maximum: "+((x>y)?x:y));
        else System.out.println("Weder noch");
    }
}
