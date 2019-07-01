package ab05;

import java.util.Scanner;

public class Aufgabe09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean success = true;
        int p = 0;
        do {
            try {
                p = scanner.nextInt();
                success = true;
                if(p < 0) throw new ArithmeticException("number must be >= 0");
            } catch(ArithmeticException e) {
                e.getMessage();
                success = false;
            }
        } while(!success);
        System.out.println(Aufgabe04.recFactorial(p));
        System.out.println(Aufgabe04.itFactorial(p));
    }
}
