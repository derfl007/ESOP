package ab01;

import java.util.Scanner;

import static java.lang.Math.PI;

public class Aufgabe11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r = scanner.nextInt();
        double u = 2*r*PI;
        double f = r*r*PI;
        System.out.println("Umkreis = "+u);
        System.out.println("Fläche = "+f);
    }
}
