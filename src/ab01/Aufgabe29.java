package ab01;

import java.util.Scanner;

public class Aufgabe29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        if(x <0) x*=-1;
        if(x>=1 && x<=5) System.out.println("Uni/Arbeit");
        else if(x>5 && x<8) System.out.println("Wochenende");
        else System.out.println("Weder noch");
    }
}
