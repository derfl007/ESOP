package ab01;

import java.util.Scanner;

public class Aufgabe16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[3];
        numbers[0] = scanner.nextInt();
        numbers[1] = scanner.nextInt();
        numbers[2] = scanner.nextInt();
        int max = numbers[0];
        int min = numbers[0];
        for(int n : numbers) {
            if(n > max) max = n;
            if(n < min) min = n;
        }
        System.out.println("Max: "+max+", Min: "+min);
    }
}
