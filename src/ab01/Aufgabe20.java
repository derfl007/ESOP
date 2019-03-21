package ab01;

import java.util.*;

public class Aufgabe20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amt = scanner.nextInt();
        if(amt % 5 != 0) {
            System.out.println("Betrag kann nicht verarbeitet werden!");
        } else {
            Map<Integer, Integer> notes = new HashMap<>();
            notes.put(500, Math.floorDiv(amt, 500));
            //schein500 = Math.floorDiv(amt, 500)
            amt %= 500; //amt = amt % 500
            notes.put(100, Math.floorDiv(amt, 100));
            amt %= 100;
            notes.put(50, Math.floorDiv(amt, 50));
            amt %= 50;
            notes.put(20, Math.floorDiv(amt, 20));
            amt %= 20;
            notes.put(10, Math.floorDiv(amt, 10));
            amt %= 10;
            notes.put(5, Math.floorDiv(amt, 5));
            System.out.println(notes);
        }
    }
}