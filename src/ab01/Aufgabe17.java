package ab01;

import java.util.Scanner;

public class Aufgabe17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float z = scanner.nextFloat();
        float n = scanner.nextFloat();
        if(n == 0) System.out.println("Nenner ist 0");
        else System.out.println(z/n);
    }
}
