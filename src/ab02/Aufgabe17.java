package ab02;

import java.util.ArrayList;
import java.util.Scanner;

@SuppressWarnings("Duplicates")
public class Aufgabe17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> a = new ArrayList<>();
        int x;
        do {
            x = scanner.nextInt();
            a.add(x);
        } while (x != 0);
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        for(int i : a) {
            if(i >= 0) pos.add(i);
            else neg.add(i);
        }
        System.out.println("Positive numbers: " + pos + ", negative numbers: " + neg);
    }
}
