package ab01;

import java.util.Scanner;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Aufgabe24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] m = {scanner.nextDouble(), scanner.nextDouble()};
        double r = scanner.nextDouble();
        double[] p = {scanner.nextDouble(), scanner.nextDouble()};
        double a = pow(p[0]-m[0], 2) + pow(p[1]-m[1], 2);
        if(a < r) System.out.println("Innerhalb");
        else if(a==r) System.out.println("Auf dem Kreis");
        else System.out.println("Außerhalb");
        System.out.println(a);
    }
}
