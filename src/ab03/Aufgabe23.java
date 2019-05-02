package ab03;

import java.util.Scanner;

public class Aufgabe23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        for (char i = 'A'; i < size+'A'; i++) {
            for(int j = 1; j <= size; j++) {
                System.out.print(i+""+j+" ");
            }
            System.out.println();
        }
    }
}
