package ab04;

import java.util.Scanner;

public class Aufgabe03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(change(s));
    }

    private static String change(String s) {
        String s1 = s.substring(0, s.indexOf('.')+2);
        String s2 = s.substring(s.indexOf('.')+2);
        s = s2+" "+s1;
        s = s.toUpperCase();
        s = s.replace('.', '!');
        return s;
    }
}
