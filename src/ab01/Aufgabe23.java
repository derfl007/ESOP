package ab01;

import java.util.Scanner;

public class Aufgabe23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        String type;
        if (a == b && b == c) type = "gleichseitiges";
        if ((a == b) || (b == c) || (a == c)) type = "gleichschenkliges";
        if (((a * a) + (b * b)) == (c * c) || ((a * a) + (c * c)) == (b * b) || ((b * b) + (c * c)) == (a * a))
            type = "rechtwinkliges";
        else type = "kein";
        System.out.println(type + " Dreieck");
    }
}
