package ab02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

@SuppressWarnings("Duplicates")
public class Aufgabe14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> a = new ArrayList<>();
        int x;
        do {
            x = scanner.nextInt();
            a.add(x);
        } while (x != 0);
        int max = 0;
        int max2 = 0;
        for(int i = 0; i < a.size(); i++) {
            if(a.get(i) > max) {
                max = a.get(i);
            } else if(a.get(i) > max2) {
                max2 = a.get(i);
            }
        }
        System.out.println("Highest: " + max + ", Second highest: " + max2);
    }
}
