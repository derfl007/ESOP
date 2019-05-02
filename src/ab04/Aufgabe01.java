package ab04;

import java.util.Scanner;

public class Aufgabe01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        System.out.println(s.indexOf('a'));
        System.out.println(s.charAt(0));
        System.out.println(s.charAt(s.length() - 1));
    }
}
