package ab01;

import java.util.Scanner;

public class Aufgabe22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float income = scanner.nextFloat();
        double tax = 0;
        if(income <= 5000) tax = 10;
        if(income > 5000 & income <= 15000) tax = 22;
        if(income > 15000 && income <= 30000) tax = 32;
        if(income > 30000) tax = 42;
        double income_taxed = income - (income*(tax/100));
        System.out.println("Die Steuer ist "+tax+"% hoch");
        sou
    }
}
