package ab05;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Aufgabe08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean repeat;
        do {
            System.out.println("welcome\nPlease enter the first number");
            int p1 = 1;
            int p2 = 1;
            boolean success;
            do {
                try {
                    p1 = scanner.nextInt();
                    success = true;
                } catch(InputMismatchException e) {
                    System.err.println("ERROR: Please input an integer");
                    success = false;
                }
            } while (!success);
            do {
                try {
                    p2 = scanner.nextInt();
                    if(p2 == 0) throw new ArithmeticException("Second number cannot be 0");
                    success = true;
                } catch (InputMismatchException e) {
                    System.err.println("ERROR: Please input an integer");
                    success = false;
                } catch (ArithmeticException e) {
                    e.getMessage();
                    success = false;
                }
            } while(!success);
            System.out.println(p1 + " / " + p2 + " = " + (p1/p2));
            System.out.println("Do you want to do another division? [y/n]");
            repeat = scanner.next().equals("y");
        } while(repeat);
    }
}
