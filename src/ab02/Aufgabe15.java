package ab02;

import java.util.ArrayList;
import java.util.Scanner;

@SuppressWarnings("Duplicates")
public class Aufgabe15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> a = new ArrayList<>();
        int x;
        do {
            x = scanner.nextInt();
            a.add(x);
        } while (x != 0);
        int max = a.get(0);
        int max2 = a.get(0);
        int max_index = 0;
        int max2_index = 0;
        for(int i = 0; i < a.size(); i++) {
            if(a.get(i) > max) {
                max = a.get(i);
                max_index = i;
            } else if(a.get(i) > max2) {
                max2 = a.get(i);
                max2_index = i;
            }
        }
        System.out.println("Highest: " + max + " at " + max_index + ", Second highest: " + max2 + " at " + max2_index);
    }
}
