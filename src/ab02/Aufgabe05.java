package ab02;

import java.util.Scanner;

public class Aufgabe05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i = 0;
        int x = 0;
        while(i<n*2) {
            i+=2;
            x+=i;
        }
        System.out.println(x);
    }
}
