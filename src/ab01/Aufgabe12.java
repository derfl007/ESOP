package ab01;

import java.util.Scanner;

public class Aufgabe12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double km = scanner.nextDouble();
        double fuel = scanner.nextDouble();
        double fuelPerHundred = fuel / km * 100;
        System.out.println(fuelPerHundred);
    }
}
