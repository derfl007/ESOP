package ab01;

import java.util.Scanner;

public class Aufgabe22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double income = scanner.nextDouble();
        double incomeTax;

        if(income < 5000) {
            incomeTax = income*0.1;
        } else if(income < 15000) {
            incomeTax = 500 + ((income-5000) * 0.22);
        } else if(income < 30000) {
            incomeTax = (500+(10000*0.22)) + ((income-15000) * 0.32);
        } else {
            incomeTax = (500+(10000*0.22)+(15000*0.32)) + ((income-30000) * 0.42);
        }
        System.out.println(incomeTax);
    }
}